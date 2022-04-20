package com.microwang.summarize.nio;


import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * 类名: NIODiscardServer
 * 说明: TODO
 * 时间: 2022-04-11 11:30
 * 作者: 王钟游
 *
 * @author wang zhong you*/
public class NIODiscardServer {

    public static void main(String[] args) throws Exception{
        initServer();
    }

    private static void initServer() throws Exception{
        Selector selector = Selector.open();


    }


}
