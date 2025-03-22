package com.crazylychee.demo01.design;

// 日志记录处理器
public class LogHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(int request) {
        System.out.println("LogHandler: 记录请求日志");
        if (next != null) {
            next.handle(request); // 传递给下一个处理器
        }
    }
}
