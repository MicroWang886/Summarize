package com.microwang.summarize.DesignPattern.decorator;

/**
 * 类名: retryHttpClient
 * 说明: TODO
 * 时间: 2022-03-20 8:56
 * 作者: 王钟游
 **/
public class SessionHttpClient extends HttpClientDecorator {

    public SessionHttpClient(HttpClient delegate) {
        super(delegate);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("增加缓存逻辑");
    }

}
