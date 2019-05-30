package com.dubbo.provider;

import com.dubbo.service.SomeService;

public class WeChatSomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("run in WeChat");
        return "微信支付成功";
    }
}
