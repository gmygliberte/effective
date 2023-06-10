package com.gmy.a11.b78;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author gmy
 * @date 2023/6/9 14:24
 */
@Slf4j
public class StopThread {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                i++;
            }
        }, "thread1");
        thread1.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
