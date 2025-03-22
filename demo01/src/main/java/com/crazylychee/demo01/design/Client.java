package com.crazylychee.demo01.design;



public class Client {
    public static void main(String[] args) {
        Handler logHandler = new LogHandler();
        Handler authHandler = new AuthHandler();

        // 设置链式关系
        logHandler.setNext(authHandler);


        logHandler.handle(1);
    }
}
