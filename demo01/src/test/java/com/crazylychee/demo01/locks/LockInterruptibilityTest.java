package com.crazylychee.demo01.locks;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class LockInterruptibilityTest {

    // ReentrantLock 可中断性示例
    /**
     * 可中断测试
     * @throws InterruptedException
     */
    @Test
    public void testReentrantLockInterrupt() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                Thread.sleep(2000); // 持有锁 2 秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                // 可中断地获取锁
                lock.lockInterruptibly();
                System.out.println("Thread 2 acquired lock");
                lock.unlock();
            } catch (InterruptedException e) {
                System.out.println("Thread 2 was interrupted while waiting");
            }
        });

        t1.start();         // (1) 启动线程 t1
        Thread.sleep(100);  // (2) 主线程（当前线程）沉睡100毫秒
        t2.start();         // (3) 启动线程 t2
        Thread.sleep(500);  // (4) 主线程（当前线程）再次沉睡500毫秒
        t2.interrupt();     // (5) 主线程中断线程 t2
        t1.join();          // (6) 主线程等待线程 t1 结束
        t2.join();          // (7) 主线程等待线程 t2 结束
    }

    // synchronized 不支持中断（测试会一直等待）

    /**
     * 不支持中断
     * @throws InterruptedException
     */
    @Test
    public void testSynchronizedNoInterrupt() throws InterruptedException {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 acquired lock");
            }
        });

        t1.start();
        Thread.sleep(100);
        t2.start();

        // 尝试中断 t2（无效）
        Thread.sleep(500);
        t2.interrupt();

        t1.join();
        t2.join();
    }


    /**
     * ReentrantLock的tryLock
     * 超时尝试
     * @throws InterruptedException
     */
    @Test
    public void testTryLockWithTimeout() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                // 尝试在 1 秒内获取锁
                if (lock.tryLock(2, TimeUnit.SECONDS)) {
                    System.out.println("Thread 2 acquired lock");
                    lock.unlock();
                } else {
                    System.out.println("Thread 2 failed to acquire lock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    /**
     * ReentrantLock
     * 公平锁特性
     * 默认按照线程等待顺序获取锁
     * @throws InterruptedException
     */
    @Test
    public void testFairLock() throws InterruptedException {
        // 创建公平锁
        ReentrantLock fairLock = new ReentrantLock(true);

        Runnable task = () -> {
            fairLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired lock");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                fairLock.unlock();
            }
        };

        // 启动多个线程竞争锁
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }


    /**
     * 多条件变量唤醒
     * @throws InterruptedException
     */
    @Test
    public void testMultipleConditions() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();

        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Thread 1 waiting on conditionA");
                conditionA.await(); // 等待 conditionA
                System.out.println("Thread 1 resumed from conditionA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Thread 2 waiting on conditionB");
                conditionB.await(); // 等待 conditionB
                System.out.println("Thread 2 resumed from conditionB");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread t3 = new Thread(() -> {
            lock.lock();
            try {
                Thread.sleep(1000);
                conditionA.signal(); // 唤醒 conditionA
                conditionB.signal(); // 唤醒 conditionB
                System.out.println("Thread 3 signaled both conditions");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }

}

