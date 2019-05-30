package com.dubbo.provider;

import com.dubbo.service.SomeService;

public class OldSomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("run in old service");
        return "old service";
    }
}
