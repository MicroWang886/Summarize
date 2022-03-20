package com.microwang.summarize.DesignPattern.decorator;

/**
 * 类名: MyTest
 * 说明: TODO
 * 时间: 2022-03-20 8:55
 * 作者: 王钟游
 **/
public class MyTest {

    public static void main(String[] args) {
        HttpClient retryHttpClient = new retryHttpClient(new DefaultHttpClient());
        HttpClient sessionHttpClient = new SessionHttpClient(retryHttpClient);
        sessionHttpClient.sendMessage();
    }

}
