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

package com.crazylychee.demo06turms.access.client.websocket;

import com.crazylychee.demo06turms.access.client.common.channel.ServiceAvailabilityHandler;
import com.crazylychee.demo06turms.thread.ThreadNameConst;
import im.turms.server.common.access.common.LoopResourcesFactory;
import im.turms.server.common.infra.metrics.TurmsMicrometerChannelMetricsRecorder;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import jakarta.annotation.Nullable;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.Connection;
import reactor.netty.DisposableServer;
import reactor.netty.http.server.*;

import java.net.InetSocketAddress;
import java.util.List;

import static im.turms.server.common.access.admin.web.HttpUtil.isPreFlightRequest;
import static io.netty.channel.ChannelOption.*;
import static io.netty.handler.codec.http.HttpHeaderNames.*;

/**
 * @author James Chen
 */
public final class WebSocketServerFactory {

    private WebSocketServerFactory() {
    }

    public static DisposableServer create(
            int maxFramePayloadLength) {
        ServiceAvailabilityHandler serviceAvailabilityHandler = new ServiceAvailabilityHandler();
        WebsocketServerSpec serverSpec = WebsocketServerSpec.builder()
                .maxFramePayloadLength(maxFramePayloadLength)
                .build();
        // Don't set SO_SNDBUF and SO_RCVBUF because of
        // the reasons mentioned in https://developer.aliyun.com/article/724580
        String host = "0.0.0.0";
        int port = 10510;



        HttpServer server = HttpServer.create()
                .host(host)
                .port(port)
                .option(CONNECT_TIMEOUT_MILLIS, 3000)
                .option(SO_REUSEADDR, true)
                .childOption(SO_REUSEADDR, true)
                .childOption(SO_LINGER, 0)
                .childOption(TCP_NODELAY, true)
                .proxyProtocol(ProxyProtocolSupportType.ON)
                .runOn(LoopResourcesFactory.createForServer(ThreadNameConst.GATEWAY_WS_PREFIX))
                .metrics(true,
                        () -> new TurmsMicrometerChannelMetricsRecorder(
                                "turms.client.network",
                                "websocket"))
                .handle((request, response) -> handleHttpRequest(
                        request,
                        response,
                        serverSpec))
                .doOnChannelInit((connectionObserver, channel, remoteAddress) -> channel.pipeline()
                        .addFirst("serviceAvailabilityHandler", serviceAvailabilityHandler));


            server = server.forwarded(new HttpForwardedHeaderHandler(false));



            return server.bind()
                    .block();


    }

    public static void main(String[] args) {
        int maxFramePayloadLength = 65536;

        ServiceAvailabilityHandler serviceAvailabilityHandler = new ServiceAvailabilityHandler();
        WebsocketServerSpec serverSpec = WebsocketServerSpec.builder()
                .maxFramePayloadLength(maxFramePayloadLength)
                .build();
        // Don't set SO_SNDBUF and SO_RCVBUF because of
        // the reasons mentioned in https://developer.aliyun.com/article/724580
        String host = "0.0.0.0";
        int port = 10515;




        HttpServer server = HttpServer.create()
                .host(host)
                .port(port)
                .option(CONNECT_TIMEOUT_MILLIS, 3000)
                .option(SO_REUSEADDR, true)
                .childOption(SO_REUSEADDR, true)
                .childOption(SO_LINGER, 0)
                .childOption(TCP_NODELAY, true)
                .proxyProtocol(ProxyProtocolSupportType.ON)
                .runOn(LoopResourcesFactory.createForServer(ThreadNameConst.GATEWAY_WS_PREFIX))
                .metrics(true,
                        () -> new TurmsMicrometerChannelMetricsRecorder(
                                "turms.client.network",
                                "websocket"))
                .handle((request, response) -> handleHttpRequest(
                        request,
                        response,
                        serverSpec))
                .doOnChannelInit((connectionObserver, channel, remoteAddress) -> channel.pipeline()
                        .addFirst("serviceAvailabilityHandler", serviceAvailabilityHandler));


        server = server.forwarded(new HttpForwardedHeaderHandler(false));



        server.bind()
                .block();


    }


    /**
     * @implNote 1. Return MonoNever to keep the connection alive
     *           <p>
     *           2. Return MonoEmpty to close the connection.
     */
    private static Publisher<Void> handleHttpRequest(
            HttpServerRequest request,
            HttpServerResponse response,
            WebsocketServerSpec serverSpec) {
        // 1. Always respond with OK to CORS preflight requests
        if (isPreFlightRequest(request)) {
            return response.status(HttpResponseStatus.OK)
                    .addHeader(ACCESS_CONTROL_ALLOW_ORIGIN, "*")
                    .addHeader(ACCESS_CONTROL_ALLOW_METHODS, "*")
                    .addHeader(ACCESS_CONTROL_ALLOW_HEADERS, "*")
                    .addHeader(ACCESS_CONTROL_MAX_AGE, "7200")
                    .send()
                    .then(Mono.never());
        }
        // 2. Validate handshake request
        HttpResponseStatus errorStatus = validateHandshakeRequest(request);
        if (errorStatus != null) {
            return response.status(errorStatus)
                    .send()
                    // Close the TCP connection
                    .then();
        }
        // 3. Get the real client address
        InetSocketAddress remoteAddress = request.remoteAddress();

        // 4. Check if the client address has been blocked
        if (remoteAddress != null) {
            return Mono.empty();
        }

        // 5. Upgrade to WebSocket
        // reactor.netty.http.server.HttpServer.HttpServerHandle.onStateChange
        int maxFramePayloadLength = serverSpec.maxFramePayloadLength();
        return response.sendWebsocket((in, out) -> {
            Flux<ByteBuf> inbound = in.aggregateFrames(maxFramePayloadLength)
                    .receiveFrames()
                    // Note that:
                    // 1. PingWebSocketFrame will be handled by Netty itself
                    // 2. The flatMap is called by FluxReceive, which will release buffer after
                    // "onNext" returns.
                    .flatMap(frame -> frame instanceof BinaryWebSocketFrame
                            ? Mono.just(frame.content())
                            : Mono.empty());
            Mono<Void> onClose = in.receiveCloseStatus()
                    .then();
            // BinaryWebSocketFrame will be created by
            // reactor.netty.http.server.WebsocketServerOperations.send
            Connection connection = (Connection) in;
            InetSocketAddress remoteAddr = remoteAddress == null
                    ? (InetSocketAddress) connection.channel()
                            .remoteAddress()
                    : remoteAddress;
            return null;
        }, serverSpec);
    }

    @Nullable
    private static HttpResponseStatus validateHandshakeRequest(HttpServerRequest request) {
        HttpMethod method = request.method();
        HttpHeaders headers = request.requestHeaders();
        if (HttpMethod.GET != method) {
            return new HttpResponseStatus(
                    HttpResponseStatus.METHOD_NOT_ALLOWED.code(),
                    "Request method '"
                            + method
                            + "' not supported");
        }
        if (!"WebSocket".equalsIgnoreCase(headers.get(UPGRADE))) {
            return new HttpResponseStatus(
                    HttpResponseStatus.BAD_REQUEST.code(),
                    "Invalid 'Upgrade' header: "
                            + headers);
        }
        List<String> connectionValue = headers.getAll(CONNECTION);
        if (!connectionValue.contains("Upgrade") && !connectionValue.contains("upgrade")) {
            return new HttpResponseStatus(
                    HttpResponseStatus.BAD_REQUEST.code(),
                    "Invalid 'Connection' header: "
                            + headers);
        }
        String key = headers.get(SEC_WEBSOCKET_KEY);
        if (key == null) {
            return new HttpResponseStatus(
                    HttpResponseStatus.BAD_REQUEST.code(),
                    "Missing \"Sec-WebSocket-Key\" header");
        }
        return null;
    }

}
