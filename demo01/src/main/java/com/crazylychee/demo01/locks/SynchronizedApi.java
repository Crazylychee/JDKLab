package com.crazylychee.demo01.locks;
public class SynchronizedApi {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread producer = new Thread(new Producer(lock));
        Thread consumer = new Thread(new Consumer(lock));

        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable {
    private final Object lock;

    public Producer(Object lock) {
        this.lock = lock;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                System.out.println("Producer is producing an item: " + i);
                // 生产完成后，通知消费者
                lock.notify();
                try {
                    // 生产完毕，等待消费者消费
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Consumer implements Runnable {
    private final Object lock;

    public Consumer(Object lock) {
        this.lock = lock;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                System.out.println("Consumer is consuming an item: " + i);
                // 消费完成后，通知生产者
                lock.notify();
                try {
                    // 消费完毕，等待生产者生产
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
