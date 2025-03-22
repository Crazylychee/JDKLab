package com.crazylychee.demo01.thread.safety.visibility;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class VisibilityDemo {
        private static int x = 0;
        private static int y = 0;
        //下面的a和b变量不加volatile修饰，就会出现0，0的情况，也就是指令重排序后引起的可见性问题
        private static int a = 0;
        private static volatile int b = 0;

        public static void main(String[] args) throws Exception {

            for (int i = 0; i < 1000; i++) {
                x = y = a = b = 0;
                Thread one = new Thread(() -> {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    a = 1;
                    x = b;
                });
                Thread two = new Thread(() -> {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    b = 1;
                    y = a;
                });
                one.start();
                two.start();
                one.join();

                two.join();
                if (x == 0 && y == 0) {
                    System.out.println(x + " " + y);
                }
            }
        }

    }
