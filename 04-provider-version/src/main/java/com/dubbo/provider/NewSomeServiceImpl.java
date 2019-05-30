package com.dubbo.provider;

import com.dubbo.service.SomeService;

public class NewSomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("run in new service");
        return "new service";
    }
}
