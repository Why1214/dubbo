package com.dubbo.run;

import com.dubbo.service.OtherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRunAsync {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");

        OtherService otherService = (OtherService) context.getBean("otherService");

        long startTime = System.currentTimeMillis();

        String doThird = otherService.doThird();
        System.out.println("异步，doThird()直接获取到返回值：" + doThird);

        String doFourth = otherService.doFourth();
        System.out.println("异步，doFourth()直接获取到返回值：" + doFourth);

        long endTime = System.currentTimeMillis();

        System.out.println("两个同步操作共计用时：" + (endTime - startTime));
    }
}
