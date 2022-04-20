package com.microwang.summarize.file;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * 类名: FileGet
 * 说明: TODO
 * 时间: 2022-03-24 14:21
 * 作者: 王钟游
 **/
public class FileGet {

    public static void main(String[] args) throws IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = contextClassLoader.getResources("D:\\code\\Summarize\\src\\main\\java\\com\\microwang\\summarize\\file\\spring_test-1.0-SNAPSHOT.jar");
        System.out.println(resources);
    }

}
