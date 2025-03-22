package com.crazylychee.demo01.thread.safety.atomicity;

import lombok.Data;

@Data
public class Counter {
    private int count = 0;

    public void increment() {
        count++; // 非原子操作：实际是 read-modify-write 三步操作
    }
}
