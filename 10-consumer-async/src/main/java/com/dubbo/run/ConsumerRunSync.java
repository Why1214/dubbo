package com.dubbo.run;

import com.dubbo.service.OtherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRunSync {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");

        OtherService otherService = (OtherService) context.getBean("otherService");

        long startTime = System.currentTimeMillis();

        String doFirst = otherService.doFirst();
        System.out.println("同步，doFirst()直接获取到返回值：" + doFirst);

        String doSecond = otherService.doSecond();
        System.out.println("同步，doSecond()直接获取到返回值：" + doSecond);

        long endTime = System.currentTimeMillis();

        System.out.println("两个同步操作共计用时：" + (endTime - startTime));
    }
}
