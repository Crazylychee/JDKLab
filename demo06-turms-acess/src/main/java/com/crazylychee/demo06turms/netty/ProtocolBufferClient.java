package com.crazylychee.demo06turms.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ProtocolBufferClient {

    private final String host;
    private final int port;
    private Channel channel;

    public ProtocolBufferClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap()
                    .group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) {
                            ChannelPipeline pipeline = ch.pipeline();

                            // 编码器（从下到上执行）
                            pipeline.addLast(new StringEncoder(StandardCharsets.UTF_8)); // 字符串 -> ByteBuf
                            pipeline.addLast(new LengthFieldPrepender(4)); // 添加长度头

                            // 解码器（从上到下执行）
                            pipeline.addLast(new LengthFieldBasedFrameDecoder(1048576, 0, 4, 0, 4));
                            pipeline.addLast(new StringDecoder(StandardCharsets.UTF_8)); // ByteBuf -> String

                            // 业务处理器
                            pipeline.addLast(new ClientHandler());
                        }
                    });

            ChannelFuture future = bootstrap.connect(host, port).sync();
            this.channel = future.channel();
            future.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully();
        }
    }
    public void sendRequest(String request) {
        if (channel != null && channel.isActive()) {
            System.out.println("Sending request: " + request);
            channel.writeAndFlush(request);
        } else {
            System.err.println("Connection not active");
        }
    }

    public static void main(String[] args) throws Exception {
        ProtocolBufferClient client = new ProtocolBufferClient("127.0.0.1", 10510);
        Scanner scanner = new Scanner(System.in);
        new Thread(() -> {
            String request = scanner.nextLine();
            while (!"exit".equals(request)) {

                client.sendRequest(request);
                request = scanner.nextLine();
            }
        }).start();
        client.start();
    }
}
