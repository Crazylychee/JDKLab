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

import com.crazylychee.demo06turms.access.client.common.channel.ServiceAvailabilityHandler;
import com.crazylychee.demo06turms.thread.ThreadNameConst;
import im.turms.server.common.access.client.codec.CodecFactory;
import im.turms.server.common.access.common.LoopResourcesFactory;

import im.turms.server.common.infra.metrics.TurmsMicrometerChannelMetricsRecorder;
import im.turms.server.common.infra.net.BindException;
import io.netty.channel.ChannelPipeline;
import reactor.core.publisher.Sinks;
import reactor.netty.Connection;
import reactor.netty.DisposableServer;
import reactor.netty.NettyPipeline;
import reactor.netty.tcp.TcpServer;

import java.net.InetSocketAddress;

import static io.netty.channel.ChannelOption.*;

/**
 * 创建和管理tcp服务器的工厂类
 */

/**
 * @author James Chen
 */
public final class TcpServerFactory {

    private TcpServerFactory() {
    }

    public static DisposableServer create() {
        ServiceAvailabilityHandler serviceAvailabilityHandler = new ServiceAvailabilityHandler();
        String host = "0.0.0.0";
        int port = 10511;


        Sinks.One<InetSocketAddress> remoteAddressSink = Sinks.one();
        TcpServer server = TcpServer.create()
                .host(host)
                .port(port)
                .option(CONNECT_TIMEOUT_MILLIS, 3000)
                // Don't set SO_SNDBUF and SO_RCVBUF because of
                // the reasons mentioned in https://developer.aliyun.com/article/724580
                .option(SO_REUSEADDR, true)
                .childOption(SO_REUSEADDR, true)
                .childOption(SO_LINGER, 0)
                .childOption(TCP_NODELAY, true)
                .runOn(LoopResourcesFactory.createForServer(ThreadNameConst.GATEWAY_TCP_PREFIX))
                .metrics(true,
                        () -> new TurmsMicrometerChannelMetricsRecorder(
                                "turms.client.network",
                                "tcp"))
                // Called for every new connection that is opened.
                .doOnChannelInit((connectionObserver, channel, remoteAddress) -> {
                    ChannelPipeline pipeline = channel.pipeline();
                    pipeline.addFirst("serviceAvailabilityHandler", serviceAvailabilityHandler);
                    // Inbound
                    pipeline.addBefore(NettyPipeline.ReactiveBridge,
                            "varintLengthBasedFrameDecoder",
                            CodecFactory.getExtendedVarintLengthBasedFrameDecoder(512));


                    // Outbound
                    pipeline.addLast("varintLengthFieldPrepender",
                            CodecFactory.getVarintLengthFieldPrepender());
                    // For advanced operations, they encode objects to buffers themselves,
                    // "protobufFrameEncoder" will just ignore them. But some simple
                    // operations will pass TurmsNotification instances down, so we still need to
                    // encode them.
                    pipeline.addLast("protobufFrameEncoder",
                            CodecFactory.getProtobufFrameEncoder());
                })
                // Called when a connection is read (in/after channelActive(...)).
                .handle((in, out) -> {
                    Connection connection = (Connection) in;
                    // Note:
                    // 1. We need to trigger the read event manually here.
                    // Otherwise, it will never read the inbound stream from the peer
                    // because we don't subscribe to the inbound stream until we get the peer
                    // address.
                    // 2. Although "setAutoRead" seems just setting the "autoRead" flag to true,
                    // it also triggers the read event under the hood.
                    // 3. Don't move "setAutoRead" to the callback of "doOnChannelInit" because the
                    // channel is not ready yet, and "setAutoRead" will not work.
                    connection.channel()
                            .config()
                            .setAutoRead(true);
                    return null;
                });


        try {
            return server.bind()
                    .block();
        } catch (Exception e) {
            String message = "Failed to bind the TCP server on: "
                    + host
                    + ":"
                    + port;
            throw new BindException(message, e);
        }
    }

}
