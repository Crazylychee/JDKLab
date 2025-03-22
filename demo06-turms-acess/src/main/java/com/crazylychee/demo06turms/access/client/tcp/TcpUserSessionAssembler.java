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

package com.crazylychee.demo06turms.access.client.tcp;


import com.crazylychee.demo06turms.access.client.common.UserSessionAssembler;
import com.crazylychee.demo06turms.access.client.common.connection.NetConnection;
import im.turms.server.common.infra.exception.FeatureDisabledException;
import im.turms.server.common.infra.logging.core.logger.Logger;
import im.turms.server.common.infra.logging.core.logger.LoggerFactory;
import lombok.Getter;
import org.springframework.stereotype.Component;
import reactor.netty.Connection;
import reactor.netty.DisposableServer;
import reactor.netty.channel.ChannelOperations;

import java.time.Duration;

/**
 * 用于组装和管理tcp用户会话
 */

/**
 * @author James Chen
 */
@Component
public class TcpUserSessionAssembler extends UserSessionAssembler {

    private static final Logger LOGGER = LoggerFactory.getLogger(TcpUserSessionAssembler.class);

    private final DisposableServer server;
    @Getter
    private final boolean enabled;
    private final String host;
    private final int port;

    public TcpUserSessionAssembler() {
        super(2000, 2000);


        enabled = true;
        if (enabled) {
            server = TcpServerFactory.create();
            host = server.host();
            port = server.port();
            LOGGER.info("TCP server started on: {}:{}", host, port);

        } else {
            server = null;
            host = null;
            port = -1;
        }
    }

    @Override
    protected NetConnection createConnection(Connection connection, Duration closeTimeout) {
        return new TcpConnection((ChannelOperations<?, ?>) connection, true, closeTimeout);
    }

    public String getHost() {
        if (server == null) {
            throw new FeatureDisabledException("TCP server is disabled");
        }
        return host;
    }

    public int getPort() {
        if (server == null) {
            throw new FeatureDisabledException("TCP server is disabled");
        }
        return port;
    }

}
