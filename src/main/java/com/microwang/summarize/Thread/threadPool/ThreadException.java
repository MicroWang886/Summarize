package com.microwang.summarize.Thread.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 类名: ThreadException
 * 说明: TODO
 * 时间: 2022-04-27 7:58
 * 作者: 王钟游
 **/
public class ThreadException {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), new ThreadFactory() {

            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setUncaughtExceptionHandler((t1, e) -> {
                    System.out.println(t1.getName() + "线程抛出的异常" + e);
                });
                return t;
            }

        });

        threadPoolExecutor.execute(() -> {
            Object o = null;
            System.out.println(o.toString());
        });

    }

}
