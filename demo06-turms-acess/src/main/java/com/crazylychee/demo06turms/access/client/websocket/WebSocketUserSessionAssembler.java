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


import com.crazylychee.demo06turms.access.client.common.UserSessionAssembler;
import com.crazylychee.demo06turms.access.client.common.connection.NetConnection;
import im.turms.server.common.infra.logging.core.logger.Logger;
import im.turms.server.common.infra.logging.core.logger.LoggerFactory;
import org.springframework.stereotype.Component;
import reactor.netty.Connection;
import reactor.netty.DisposableServer;

import java.time.Duration;

/**
 * @author James Chen
 */
@Component
public class WebSocketUserSessionAssembler extends UserSessionAssembler {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(WebSocketUserSessionAssembler.class);

    private final DisposableServer server;

    public WebSocketUserSessionAssembler() {
        super(2000,2000);

        if (true) {
            server = WebSocketServerFactory.create(
                    65536
                    );
            LOGGER.info("WebSocket server started on: {}:{}", server.host(), server.port());

        } else {
            server = null;
        }
    }

    @Override
    protected NetConnection createConnection(Connection connection, Duration closeTimeout) {
        return new WebSocketConnection(connection, true, closeTimeout);
    }

}
