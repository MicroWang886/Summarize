package com.microwang.summarize.DesignPattern.decorator;

/**
 * 类名: HttpClientDecorator
 * 说明: TODO
 * 时间: 2022-03-20 8:27
 * 作者: 王钟游
 **/
public abstract class HttpClientDecorator implements HttpClient{

    private HttpClient delegate;

    public HttpClientDecorator(HttpClient delegate) {
        this.delegate = delegate;
    }

    @Override
    public void sendMessage() {
        delegate.sendMessage();
    }
}
