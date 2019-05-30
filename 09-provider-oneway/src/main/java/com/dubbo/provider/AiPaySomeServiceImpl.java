package com.dubbo.provider;

import com.dubbo.service.SomeService;

public class AiPaySomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("run in AiPay");
        return "支付宝支付成功";
    }
}
