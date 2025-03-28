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


import com.crazylychee.demo06turms.access.client.common.connection.NetConnection;
import com.crazylychee.demo06turms.thread.ThreadNameConst;
import im.turms.server.common.domain.session.bo.CloseReason;
import im.turms.server.common.domain.session.bo.SessionCloseStatus;
import im.turms.server.common.infra.lang.ByteArrayWrapper;
import im.turms.server.common.infra.thread.NamedThreadFactory;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import jakarta.annotation.Nullable;
import lombok.Data;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * Bind the network connection, and the user session together from the perspective of the access
 * layer
 *
 * @author James Chen
 */

/**
 * UserSessionWrapper 类的主要作用是将网络连接和用户会话绑定在一起，并处理会话建立的超时任务。它通过 HashedWheelTimer 来管理超时任务，并在超时发生时关闭连接。
 */
@Data
public class UserSessionWrapper {

    private static final HashedWheelTimer SESSION_ESTABLISH_TIMEOUT_TIMER = new HashedWheelTimer(
            new NamedThreadFactory(ThreadNameConst.GATEWAY_SESSION_ESTABLISH_TIMEOUT_TIMER, true));

    private final InetSocketAddress address;
    private final Timeout establishTimeoutTask;
    private final Consumer<UserSession> onSessionEstablished;
    private NetConnection connection;
    @Nullable
    private UserSession userSession;

    /**
     * Use {@link ByteArrayWrapper} instead of {@code byte[]} because {@link ByteArrayWrapper} will
     * be used as the key of Map in multiple places
     */
    @Nullable
    private ByteArrayWrapper ip;
    @Nullable
    private String ipStr;

    public UserSessionWrapper(
            NetConnection connection,
            InetSocketAddress address,
            int establishTimeoutMillis,
            Consumer<UserSession> onSessionEstablished) {
        this.connection = connection;
        this.address = address;
        this.onSessionEstablished = onSessionEstablished;
        establishTimeoutTask = establishTimeoutMillis > 0
                ? addSessionEstablishTimeoutTask(establishTimeoutMillis)
                : null;
    }

    public ByteArrayWrapper getIp() {
        if (ip == null) {
            ip = new ByteArrayWrapper(
                    address.getAddress()
                            .getAddress());
        }
        return ip;
    }

    public String getIpStr() {
        if (ipStr == null) {
            // Don't use "getHostString()" to avoid getting a hostname
            ipStr = address.getAddress()
                    .getHostAddress();
        }
        return ipStr;
    }

    public void setUserSession(UserSession userSession) {
        this.userSession = userSession;
        userSession.setConnection(connection, getIp());
        onSessionEstablished.accept(userSession);
    }

    public boolean hasUserSession() {
        return userSession != null;
    }

    private Timeout addSessionEstablishTimeoutTask(int establishTimeoutMillis) {
        return SESSION_ESTABLISH_TIMEOUT_TIMER.newTimeout(timeout -> {
            if (userSession == null || !userSession.isOpen()) {
                CloseReason closeReason = CloseReason.get(SessionCloseStatus.LOGIN_TIMEOUT);
                connection.close(closeReason);
            }
        }, establishTimeoutMillis, TimeUnit.MILLISECONDS);
    }

}
