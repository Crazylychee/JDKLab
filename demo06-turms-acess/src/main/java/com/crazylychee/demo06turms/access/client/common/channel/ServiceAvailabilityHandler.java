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

package com.crazylychee.demo06turms.access.client.common.channel;


import im.turms.server.common.infra.lang.ByteArrayWrapper;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.util.internal.OutOfDirectMemoryError;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * @author James Chen
 *
 */
@ChannelHandler.Sharable
public class ServiceAvailabilityHandler extends ChannelInboundHandlerAdapter {







    @Override
    public void channelRegistered(ChannelHandlerContext ctx) {

        if (true) {
            SocketAddress socketAddress = ctx.channel()
                    .remoteAddress();
            if (socketAddress instanceof InetSocketAddress
                    ) {
                ctx.close();
                return;
            }
            ctx.fireChannelRegistered();
        } else {
            ctx.close();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // CorruptedFrameException can be caused by:
        // 1. Illegal WebSocket frame or the frame is too large
        // 2. The varint-length header declares that it will send a large payload
        if (cause instanceof CorruptedFrameException) {
            InetSocketAddress address = (InetSocketAddress) ctx.channel()
                    .remoteAddress();
            ByteArrayWrapper ip = new ByteArrayWrapper(
                    address.getAddress()
                            .getAddress());
            System.out.println(ip);


        } else if (cause instanceof OutOfDirectMemoryError) {
            ctx.close();
        }
        ctx.fireExceptionCaught(cause);
    }

}
