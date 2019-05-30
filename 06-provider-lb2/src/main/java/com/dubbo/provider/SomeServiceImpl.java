package com.dubbo.provider;

import com.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {

    @Override
    public String hello(String name) {
        System.out.println(name + "，我是【第二个】provider");
        return "我是【第二个】provider!" + name;
    }
}
