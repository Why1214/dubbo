package com.dubbo.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderRun {

    public static void main(String[] args) throws IOException {
        // 创建一个Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-provider.xml");
        // 启动Spring容器
        context.start();
        // 使主线程阻塞
        System.in.read();
    }
}
