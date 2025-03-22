package com.crazylychee.demo01.thread.safety.order;

//双重检查锁定的单例模式

/**
 * 没有同步约束（如 volatile） 的情况下，编译器和处理器可能会对指令进行重排序。
 * 例如，步骤 2（初始化对象） 和 3（赋值给变量） 的顺序可能被交换
 * 但是实际上，指令重排序和可见性一般是一起出现的，这里留下来用做单例模式设计的提醒。
 */
public class Singleton {
    private static Singleton instance; // 未用 volatile 修饰

    public static Singleton getInstance() {
        if (instance == null) { // 第一次检查
            synchronized (Singleton.class) {
                if (instance == null) { // 第二次检查
                    instance = new Singleton(); // 可能发生指令重排序
                }
            }
        }
        return instance;
    }
}
