/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.crazylychee.demo06turms.access.client.common;


import com.crazylychee.demo06turms.proto.SimpleTurmsRequest;
import com.crazylychee.demo06turms.proto.TurmsRequestParser;
import im.turms.server.common.access.client.dto.ClientMessageEncoder;
import im.turms.server.common.access.client.dto.ClientMessagePool;
import im.turms.server.common.access.client.dto.constant.DeviceType;
import im.turms.server.common.access.client.dto.notification.TurmsNotification;
import im.turms.server.common.access.client.dto.request.TurmsRequest;
import im.turms.server.common.access.common.ResponseStatusCode;
import im.turms.server.common.access.servicerequest.dto.ServiceRequest;
import im.turms.server.common.infra.exception.ResponseException;
import im.turms.server.common.infra.exception.ThrowableInfo;
import im.turms.server.common.infra.logging.core.logger.Logger;
import im.turms.server.common.infra.logging.core.logger.LoggerFactory;
import im.turms.server.common.infra.proto.ProtoDecoder;
import im.turms.server.common.infra.proto.ProtoEncoder;
import im.turms.server.common.infra.tracing.TracingCloseableContext;
import im.turms.server.common.infra.tracing.TracingContext;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import static im.turms.server.common.access.client.dto.request.TurmsRequest.KindCase.*;
import static im.turms.server.common.infra.metrics.CommonMetricNameConst.CLIENT_REQUEST;
import static im.turms.server.common.infra.metrics.CommonMetricNameConst.CLIENT_REQUEST_TAG_TYPE;

/**
 * @author James Chen
 */
@Component
public class ClientRequestDispatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientRequestDispatcher.class);

    private static final ByteBuf HEARTBEAT_RESPONSE_SUCCESS = Unpooled.EMPTY_BUFFER;
    private static final SimpleTurmsRequest UNRECOGNIZED_REQUEST =
            new SimpleTurmsRequest(-1, KIND_NOT_SET, null);

    private static final long HEARTBEAT_FAILURE_REQUEST_ID = -100;

    private static final Mono<TurmsNotification> UNAUTHORIZED_REQUEST_ERROR_MONO =
            Mono.error(ResponseException.get(ResponseStatusCode.UNAUTHORIZED_REQUEST));




    private final IpRequestThrottler ipRequestThrottler;



    public ClientRequestDispatcher(
            IpRequestThrottler ipRequestThrottler) {

        this.ipRequestThrottler = ipRequestThrottler;
        NotificationFactory.init();
    }

    /**
     * @implNote 1. If a throwable instance is thrown due to the failure of handling the client
     *           request, the method should recover it to {@link TurmsNotification}. In other words,
     *           the method should never return MonoError, and it should be considered as a bug if
     *           it occurs. 2. The method ensures {@param serviceRequestBuffer} will be released by
     *           1
     */
    public Mono<ByteBuf> handleRequest(
            UserSessionWrapper sessionWrapper,
            ByteBuf serviceRequestBuffer) {
        // Check if it is a heartbeat request
        if (!serviceRequestBuffer.isReadable()) {
            serviceRequestBuffer.release();


            return handleHeartbeatRequest(sessionWrapper);
        }
        // Parse and handle service requests
        long requestTime = System.currentTimeMillis();
        int requestSize = serviceRequestBuffer.readableBytes();
        SimpleTurmsRequest request;
        SimpleTurmsRequest tempRequest;
        Mono<TurmsNotification> notificationMono = null;
        try {
            tempRequest = TurmsRequestParser
                    .parseSimpleRequest(ProtoDecoder.newInputStream(serviceRequestBuffer));
        } catch (Exception e) {
            serviceRequestBuffer.release();
            tempRequest = UNRECOGNIZED_REQUEST;
            UserSession session = sessionWrapper.getUserSession();

            notificationMono = Mono.error(
                    ResponseException.get(ResponseStatusCode.INVALID_REQUEST, e.getMessage()));
        }
        request = tempRequest;
        TurmsRequest.KindCase requestType = request.type();
        TracingContext tracingContext = supportsTracing(requestType)
                ? new TracingContext()
                : TracingContext.NOOP;
        // Check if we can log to avoid logging DeleteSessionRequest twice
        boolean canLogRequest = true;
        UserSession session = sessionWrapper.getUserSession();
        if (session != null) {
            if (!session.hasPermission(requestType)) {
                notificationMono = UNAUTHORIZED_REQUEST_ERROR_MONO;
            }
            if (requestType == DELETE_SESSION_REQUEST) {
                canLogRequest = session.acquireDeleteSessionRequestLoggingLock();
            }
        }
        boolean finalCanLogRequest = canLogRequest;
        if (notificationMono == null) {
            notificationMono = handleServiceRequest(sessionWrapper,
                    request,
                    serviceRequestBuffer,
                    tracingContext);
        }
        return notificationMono
                // Metrics and logging
                .name(CLIENT_REQUEST)
                .tag(CLIENT_REQUEST_TAG_TYPE, requestType.name())
                .metrics()
                .onErrorResume(throwable -> {
                    ThrowableInfo info = ThrowableInfo.get(throwable);
                    if (info.code()
                            .isServerError()) {
                        tracingContext.updateThreadContext();
                        LOGGER.error("Failed to handle the service request: {}",
                                request,
                                throwable);
                    }
                    return Mono.just(NotificationFactory.create(info, request.requestId()));
                })
                .map(notification -> {
                    TurmsRequest.KindCase type = request.type();
                    // TODO: exclude the error caused by the inactive of turms-service
                    if (ResponseStatusCode.isServerError(notification.getCode())
                            && finalCanLogRequest) {
                        try (TracingCloseableContext ignored = tracingContext.asCloseable()) {
                            UserSession userSession = sessionWrapper.getUserSession();
                            Integer version = null;
                            Long userId = null;
                            Integer sessionId = null;
                            DeviceType deviceType = null;
                            if (userSession != null) {
                                version = userSession.getVersion();
                                userId = userSession.getUserId();
                                sessionId = userSession.getId();
                                deviceType = userSession.getDeviceType();
                            }
                            LOGGER.info("Request: {}",
                                    new StringBuilder()
                                            .append("sessionId=")
                                            .append(sessionId)
                                            .append(", userId=")
                                            .append(userId)
                                            .append(", deviceType=")
                                            .append(deviceType)
                                            .append(", version=")
                                            .append(version)
                                            .append(", ip=")
                                            .append(sessionWrapper.getIpStr())
                                            .append(", requestTime=")
                                            .append(requestTime)
                                            .append(", requestSize=")
                                            .append(requestSize)
                                            .append(", type=")
                                            .append(type)
                                            .append(", requestId=")
                                            .append(request.requestId())
                                            .append(", responseTime=")
                                            .append(System.currentTimeMillis())
                                            .append(", responseCode=")
                                            .append(notification.getCode())
                                            .append(", responseReason=")
                                            .append(notification.getReason()));

                        }
                    }
                    return ProtoEncoder.getDirectByteBuffer(notification);
                })
                .contextWrite(context -> {
                    TracingContext ctx = context.get(TracingContext.CTX_KEY_NAME);
                    ctx.setTraceId(tracingContext.getTraceId());
                    return context;
                });
    }

    /**
     * The method ensures serviceRequestBuffer will be released by 1
     */
    public Mono<TurmsNotification> handleServiceRequest(
            UserSessionWrapper sessionWrapper,
            SimpleTurmsRequest request,
            ByteBuf serviceRequestBuffer,
            TracingContext tracingContext) {
        try {
            // Validate
            long requestId = request.requestId();
            if (requestId <= 0) {
                return Mono.just(NotificationFactory.create(ResponseStatusCode.INVALID_REQUEST,
                        "The request ID must be greater than 0",
                        requestId));
            }
            // Check server status



            // Handle the request to get a response
            TurmsRequest.KindCase requestType = request.type();
            tracingContext.updateThreadContext();
            return switch (requestType) {

                default -> {
                    serviceRequestBuffer.retain();
                    yield handleServiceRequest(sessionWrapper, request, serviceRequestBuffer);
                }
            };
            // Don't need to catch here to use the outer consistent catch
        } finally {
            serviceRequestBuffer.release();
            tracingContext.clearThreadContext();
        }
    }

    private Mono<ByteBuf> handleHeartbeatRequest(UserSessionWrapper sessionWrapper) {
        UserSession session = sessionWrapper.getUserSession();
        ByteBuf data;
        if (session != null && session.isOpen()) {

            data = HEARTBEAT_RESPONSE_SUCCESS;
        } else {
            data = ClientMessageEncoder.encodeResponse(System.currentTimeMillis(),
                    HEARTBEAT_FAILURE_REQUEST_ID,
                    ResponseStatusCode.UPDATE_HEARTBEAT_OF_NONEXISTENT_SESSION);
        }
        if (session != null) {
            UserSession userSession = sessionWrapper.getUserSession();
            Integer version = null;
            Long userId = null;
            Integer sessionId = null;
            DeviceType deviceType = null;
            if (userSession != null) {
                version = userSession.getVersion();
                userId = userSession.getUserId();
                sessionId = userSession.getId();
                deviceType = userSession.getDeviceType();
            }
            LOGGER.info("Heartbeat: {}",
                    new StringBuilder()
                            .append("sessionId=")
                            .append(sessionId)
                            .append(", userId=")
                            .append(userId)
                            .append(", deviceType=")
                            .append(deviceType)
                            .append(", version=")
                            .append(version)
                            .append(", ip=")
                            .append(sessionWrapper.getIpStr())
                            .append(", responseTime=")
                            .append(System.currentTimeMillis())
                            .append(", responseCode=")
                            .append(ResponseStatusCode.UPDATE_HEARTBEAT_OF_NONEXISTENT_SESSION)
                            .append(", responseReason=")
                            .append("The session is closed"));
        }
        return Mono.just(data);
    }

    private Mono<TurmsNotification> handleServiceRequest(
            UserSessionWrapper sessionWrapper,
            SimpleTurmsRequest request,
            ByteBuf serviceRequestBuffer) {
        UserSession session = sessionWrapper.getUserSession();
        if (session == null || !session.isOpen()) {
            serviceRequestBuffer.release();
            return Mono.just(NotificationFactory.sessionClosed(request.requestId()));
        }
        ServiceRequest serviceRequest = new ServiceRequest(
                sessionWrapper.getAddress()
                        .getAddress()
                        .getAddress(),
                session.getUserId(),
                session.getDeviceType(),
                request.requestId(),
                request.type(),
                serviceRequestBuffer);
        return Mono.just(ClientMessagePool.getTurmsNotificationBuilder()
                .setTimestamp(System.currentTimeMillis())
                .setRequestId(11)
                .setCode(232).build());
    }

    private TurmsNotification getNotificationFromHandlerResult(
            RequestHandlerResult result,
            long requestId) {
        TurmsNotification.Builder builder = ClientMessagePool.getTurmsNotificationBuilder()
                .setTimestamp(System.currentTimeMillis())
                .setRequestId(requestId)
                .setCode(result.code()
                        .getBusinessCode());
        String reason = result.reason();
        if (reason != null) {
            builder.setReason(reason);
        }
        return builder.build();
    }

    /**
     * @implNote Though the requests for gateway don't need to trace currently, but we may need
     *           tracing in the future, so we use a mechanism to support tracing any requests if we
     *           want
     */
    private boolean supportsTracing(TurmsRequest.KindCase requestType) {
        return requestType != CREATE_SESSION_REQUEST && requestType != DELETE_SESSION_REQUEST;
    }

}
