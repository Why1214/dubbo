package com.dubbo.run;

import com.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRun {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");

        UserService userService = (UserService) context.getBean("userService");

        String userName = userService.findUserName("001");

        System.out.println("userName:" + userName);

        userService.updateUserName("001", "why");
    }
}
