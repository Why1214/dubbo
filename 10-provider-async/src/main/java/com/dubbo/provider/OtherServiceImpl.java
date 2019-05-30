package com.dubbo.provider;

import com.dubbo.service.OtherService;

import java.util.concurrent.TimeUnit;

public class OtherServiceImpl implements OtherService {
    @Override
    public String doFirst() {
        sleep("doFirst()");
        return "doFirst()";
    }

    @Override
    public String doSecond() {
        sleep("doSecond()");
        return "doSecond()";
    }

    @Override
    public String doThird() {
        sleep("doThird()");
        return "doThird()";
    }

    @Override
    public String doFourth() {
        sleep("doFourth()");
        return "doFourth()";
    }

    private void sleep(String method) {
        long startTime = System.currentTimeMillis();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long useTime = endTime - startTime;
        System.out.println(method + "方法执行用时：" + useTime);
    }
}
