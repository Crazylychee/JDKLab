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

import im.turms.server.common.access.client.dto.ClientMessageEncoder;
import im.turms.server.common.access.client.dto.ClientMessagePool;
import im.turms.server.common.access.client.dto.notification.TurmsNotification;
import im.turms.server.common.access.common.ResponseStatusCode;
import im.turms.server.common.domain.session.bo.CloseReason;
import im.turms.server.common.infra.exception.ThrowableInfo;

import io.netty.buffer.ByteBuf;
import jakarta.annotation.Nullable;

/**
 * @author James Chen
 */
public final class NotificationFactory {

    private static boolean returnReasonForServerError;

    private NotificationFactory() {
    }

    public static void init() {

    }

    public static TurmsNotification create(ResponseStatusCode code, long requestId) {
        TurmsNotification.Builder builder = ClientMessagePool.getTurmsNotificationBuilder()
                .setTimestamp(System.currentTimeMillis())
                .setRequestId(requestId)
                .setCode(code.getBusinessCode());
        trySetReason(builder, code, code.getReason());
        return builder.build();
    }

    public static TurmsNotification create(
            ResponseStatusCode code,
            @Nullable String reason,
            long requestId) {
        TurmsNotification.Builder builder = ClientMessagePool.getTurmsNotificationBuilder()
                .setTimestamp(System.currentTimeMillis())
                .setRequestId(requestId)
                .setCode(code.getBusinessCode());
        trySetReason(builder,
                code,
                reason == null
                        ? code.getReason()
                        : reason);
        return builder.build();
    }

    public static TurmsNotification create(ThrowableInfo info, long requestId) {
        ResponseStatusCode code = info.code();
        TurmsNotification.Builder builder = ClientMessagePool.getTurmsNotificationBuilder()
                .setTimestamp(System.currentTimeMillis())
                .setRequestId(requestId)
                .setCode(code.getBusinessCode());
        trySetReason(builder, code, info.reason());
        return builder.build();
    }

    public static ByteBuf createBuffer(CloseReason closeReason) {
        ResponseStatusCode code = closeReason.businessStatusCode();
        return ClientMessageEncoder.encodeCloseNotification(System.currentTimeMillis(),
                closeReason.closeStatus(),
                code,
                getReason(code, closeReason.reason()));
    }

    public static TurmsNotification sessionClosed(long requestId) {
        return ClientMessagePool.getTurmsNotificationBuilder()
                .setTimestamp(System.currentTimeMillis())
                .setRequestId(requestId)
                .setCode(ResponseStatusCode.SERVER_INTERNAL_ERROR.getBusinessCode())
                .build();
    }

    private static void trySetReason(
            TurmsNotification.Builder builder,
            ResponseStatusCode code,
            @Nullable String reason) {
        if (reason == null) {
            return;
        }
        if (code.isServerError()) {
            if (returnReasonForServerError) {
                builder.setReason(reason);
            }
        } else {
            builder.setReason(reason);
        }
    }

    @Nullable
    private static String getReason(ResponseStatusCode code, @Nullable String reason) {
        if (reason == null) {
            return null;
        }
        if (code.isServerError()) {
            if (returnReasonForServerError) {
                return reason;
            }
        } else {
            return reason;
        }
        return null;
    }

}
