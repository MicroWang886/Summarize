package com.microwang.summarize.DesignPattern.singleton;

/**
 * 类名: Singleton
 * 说明: TODO
 * 时间: 2022-04-20 15:14
 * 作者: 王钟游
 **/
public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
