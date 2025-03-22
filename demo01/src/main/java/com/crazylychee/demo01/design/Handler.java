package com.crazylychee.demo01.design;

public interface Handler {
    void setNext(Handler next);
    void handle(int request);
}
