package com.microwang.summarize.socket;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 类名: SocketServer
 * 说明: TODO
 * 时间: 2022-04-12 14:25
 * 作者: 王钟游
 **/
public class SocketServer {

    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9000);

        while(true) {
            Socket socket = serverSocket.accept();
            executorService.execute(new Worker(socket));
        }
    }

    static class Worker implements Runnable {

        Socket socket;

        public Worker(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                System.out.println("连接已经创建");
                InputStreamReader in = new InputStreamReader(socket.getInputStream());
                OutputStream out = socket.getOutputStream();

                char[] buf = new char[1024 * 1024];
                int len = in.read(buf);
                if(len != -1) {
                    String request = new String(buf, 0, len);
                    System.out.println("[" + Thread.currentThread().getName()
                            + "]服务端接收到了请求：" + request);
                    out.write("收到，收到".getBytes());

                }

                out.close();
                in.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
