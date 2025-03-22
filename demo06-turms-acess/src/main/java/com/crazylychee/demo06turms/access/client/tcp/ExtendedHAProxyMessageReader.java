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

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.haproxy.HAProxyMessage;
import reactor.netty.transport.AddressUtils;

import java.net.InetSocketAddress;
import java.util.function.Consumer;

/**
 * 读取和处理通过haproxy代理的tcp连接中的消息
 */

/**
 * @author James Chen
 * @see {@link reactor.netty.http.server.HAProxyMessageReader}
 */
public class ExtendedHAProxyMessageReader extends ChannelInboundHandlerAdapter {

    private final Consumer<InetSocketAddress> onRemoteAddressConfirmed;

    public ExtendedHAProxyMessageReader(Consumer<InetSocketAddress> onRemoteAddressConfirmed) {
        this.onRemoteAddressConfirmed = onRemoteAddressConfirmed;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HAProxyMessage proxyMessage) {
            InetSocketAddress remoteAddress = null;
            try {
                String sourceAddress = proxyMessage.sourceAddress();
                int sourcePort = proxyMessage.sourcePort();
                if (sourceAddress != null && sourcePort > 0) {
                    remoteAddress = AddressUtils.createUnresolved(sourceAddress, sourcePort);
                }
            } finally {
                proxyMessage.release();
            }

            ctx.channel()
                    .pipeline()
                    .remove(this);
            if (remoteAddress == null) {
                onRemoteAddressConfirmed.accept((InetSocketAddress) ctx.channel()
                        .remoteAddress());
            } else {
                onRemoteAddressConfirmed.accept(remoteAddress);
            }

            ctx.read();
        } else {
            super.channelRead(ctx, msg);
        }
    }

}
/**这个 ExtendedHAProxyMessageReader 类是 Netty 的一个自定义 ChannelInboundHandlerAdapter，它用于处理通过 HAProxy 代理转发的 TCP 连接。HAProxy 是一个流行的开源负载均衡器/代理服务器，它可以在转发客户端请求时添加一些额外的头部信息，这些信息被称为 HAProxy PROXY protocol。

 以下是这个类的关键点：

 onRemoteAddressConfirmed：这是一个 Consumer<InetSocketAddress> 类型的参数，它是一个函数式接口，用于在远程地址被确认后执行一些操作。
 构造函数：

 接受一个 Consumer<InetSocketAddress> 参数，并将其存储在 onRemoteAddressConfirmed 字段中。
 channelRead 方法：

 这个方法会在接收到数据时被调用。
 它首先检查接收到的消息是否是 HAProxyMessage 类型。HAProxyMessage 是 Netty 提供的一个类，用于处理 PROXY protocol 消息。
 如果消息是 HAProxyMessage 类型，它会尝试从消息中提取原始的源地址和端口，并创建一个 InetSocketAddress。
 然后释放 HAProxyMessage 占用的资源。
 从 Channel 的 pipeline 中移除当前的处理器，因为一旦处理完 PROXY protocol 消息，就不需要再次处理了。
 如果从 HAProxyMessage 中提取的地址不为空，则使用该地址调用 onRemoteAddressConfirmed；如果为空，则使用 Channel 的远程地址。
 调用 ctx.read() 来继续读取下一条消息。
 如果接收到的消息不是 HAProxyMessage 类型，它会调用父类的 channelRead 方法，这样就可以处理其他类型的消息。
 这个处理器的目的是在处理完 PROXY protocol 消息后，从 Channel 的 pipeline 中移除自己，并通知调用者确认的远程地址。这样做是为了确保后续的消息处理可以基于正确的远程地址进行。*/
