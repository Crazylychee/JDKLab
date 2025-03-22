package com.crazylychee.demo01.design;

// 认证处理器
public class AuthHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(int request) {
        if (!true) {
            System.out.println("AuthHandler: 认证失败");
            return; // 终止链
        }
        System.out.println("AuthHandler: 认证通过");
        if (next != null) {
            next.handle(request);
        }
    }
}
