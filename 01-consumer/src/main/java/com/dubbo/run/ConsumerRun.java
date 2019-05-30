package com.dubbo.run;

import com.dubbo.service.SomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRun {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");

        SomeService someService = (SomeService) context.getBean("someService");

        String result = someService.hello("China");

        System.out.println(result);
    }
}
