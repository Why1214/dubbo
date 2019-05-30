package com.dubbo.run;

import com.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRun {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");
        UserService userService = (UserService) context.getBean("userService");

        System.out.println(userService.getUserNameById("001"));
        System.out.println(userService.getUserNameById("002"));
        System.out.println(userService.getUserNameById("001"));
        System.out.println(userService.getUserNameById("002"));
    }
}
