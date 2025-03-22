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

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.ProtocolDetectionResult;
import io.netty.handler.codec.haproxy.HAProxyMessageDecoder;
import io.netty.handler.codec.haproxy.HAProxyProtocolVersion;
import reactor.netty.NettyPipeline;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.function.Consumer;

/**
 * 用来检测haproxy proxy protocol消息，用于接受和处理tcp连接
 */

/**
 * @author James Chen
 * @see {@link reactor.netty.http.server.HAProxyMessageDetector}
 */
public class ExtendedHAProxyMessageDetector extends ByteToMessageDecoder {

    private final Consumer<InetSocketAddress> onRemoteAddressConfirmed;

    public ExtendedHAProxyMessageDetector(Consumer<InetSocketAddress> onRemoteAddressConfirmed) {
        this.onRemoteAddressConfirmed = onRemoteAddressConfirmed;
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        ProtocolDetectionResult<HAProxyProtocolVersion> detectionResult =
                HAProxyMessageDecoder.detectProtocol(in);
        if (detectionResult.equals(ProtocolDetectionResult.needsMoreData())) {
            return;
        }
        ChannelPipeline pipeline = ctx.pipeline();
        if (detectionResult.equals(ProtocolDetectionResult.invalid())) {
            pipeline.remove(this);
            onRemoteAddressConfirmed.accept((InetSocketAddress) ctx.channel()
                    .remoteAddress());
        } else {
            pipeline.replace(this, NettyPipeline.ProxyProtocolDecoder, new HAProxyMessageDecoder());
            pipeline.addAfter(NettyPipeline.ProxyProtocolDecoder,
                    NettyPipeline.ProxyProtocolReader,
                    new ExtendedHAProxyMessageReader(onRemoteAddressConfirmed));
        }
    }
}
/**
 * 这个 ExtendedHAProxyMessageDetector 类是一个 Netty 的 ByteToMessageDecoder，它用于检测输入数据流中是否存在 HAProxy PROXY protocol 消息。PROXY protocol 是一种协议，用于在代理服务器（如 HAProxy）和后端服务器之间传递原始的客户端连接信息。
 *
 * 以下是这个类的关键功能和目的：
 *
 * onRemoteAddressConfirmed：这是一个 Consumer<InetSocketAddress> 类型的参数，它是一个函数式接口，用于在检测到有效的 PROXY protocol 消息后执行一些操作，通常是更新或确认远程地址。
 * 构造函数：
 *
 * 接受一个 Consumer<InetSocketAddress> 参数，并将其存储在 onRemoteAddressConfirmed 字段中。
 * decode 方法：
 *
 * 这个方法是 ByteToMessageDecoder 类的核心，每次有数据到达时都会被调用。
 * 它使用 HAProxyMessageDecoder.detectProtocol 方法来检测输入的 ByteBuf 是否包含有效的 HAProxy PROXY protocol 消息。
 * 如果检测结果显示需要更多的数据（needsMoreData()），则方法返回，等待更多的数据到达。
 * 如果检测结果显示数据无效（invalid()），则从 pipeline 中移除当前的解码器，并使用 Channel 的远程地址调用 onRemoteAddressConfirmed。
 * 如果检测到有效的 PROXY protocol 版本，则将当前的解码器替换为 HAProxyMessageDecoder，这是 Netty 提供的用于解码 HAProxy PROXY protocol 消息的解码器。然后，在 pipeline 中添加一个新的 ExtendedHAProxyMessageReader 处理器，用于读取和处理 HAProxyMessage。
 * 总的来说，ExtendedHAProxyMessageDetector 的作用是：
 *
 * 检测输入流中是否包含有效的 HAProxy PROXY protocol 消息。
 * 如果检测到有效的 PROXY protocol，则将解码器替换为专门处理该协议的解码器，并添加一个处理器来读取消息。
 * 如果没有检测到有效的 PROXY protocol，或者数据无效，则移除自身并确认远程地址。
 * 这个类的目的是确保当使用 HAProxy 作为代理时，后端服务能够正确地获取到原始客户端的连接信息。
 */
