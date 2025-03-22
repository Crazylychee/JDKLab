package com.crazylychee.demo01.safety;

import com.crazylychee.demo01.thread.safety.atomicity.Counter;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class ThreadSaftyTests {


    @RepeatedTest(100)
    public void testIncrementAtomicity() throws InterruptedException {
        final Counter counter = new Counter();
        final int numberOfThreads = 1000;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(counter::increment);
            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
        }

        assertEquals(numberOfThreads, counter.getCount(), "Counter should be " + numberOfThreads);
    }


}
