package com.dubbo.controller;

import com.dubbo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {

    @Autowired
    private SomeService someService;

    @RequestMapping("/some.do")
    public String someHandler() {
        String result = someService.hello("China");
        System.out.println("消费者端接收到：" + result);

        return "welcome.jsp";
    }
}
