package com.crazylychee.demo06turms.netty;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;

public class ClientHandler implements ChannelHandler {

    @Override
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        System.out.println("handlerAdded");
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        System.out.println("handlerRemoved");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        System.out.println("exceptionCaught");
    }
}
