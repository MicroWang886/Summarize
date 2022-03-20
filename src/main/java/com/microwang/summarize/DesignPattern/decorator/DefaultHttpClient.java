package com.microwang.summarize.DesignPattern.decorator;

/**
 * 类名: DefaultHttpClient
 * 说明: TODO
 * 时间: 2022-03-20 8:25
 * 作者: 王钟游
 **/
public class DefaultHttpClient implements HttpClient{

    @Override
    public void sendMessage() {
        System.out.println("发送了默认的http请求");
    }

}
