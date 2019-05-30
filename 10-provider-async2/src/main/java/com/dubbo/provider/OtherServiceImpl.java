package com.dubbo.provider;

import com.dubbo.service.OtherService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class OtherServiceImpl implements OtherService {
    @Override
    public String doFirst() {
        sleep();
        return "doFirst()";
    }

    @Override
    public String doSecond() {
        sleep();
        return "doSecond()";
    }

    @Override
    public CompletableFuture<String> doThird() {
        long startTime = System.currentTimeMillis();

        sleep();

        CompletableFuture<String> future = CompletableFuture.completedFuture("doThird()----");

        long endTime = System.currentTimeMillis();
        System.out.println("doThird()方法用时：" + (endTime - startTime));
        return future;
    }

    @Override
    public CompletableFuture<String> doFourth() {
        long startTime = System.currentTimeMillis();

        sleep();

        CompletableFuture<String> future = CompletableFuture.completedFuture("doFourth()----");

        long endTime = System.currentTimeMillis();
        System.out.println("doFourth()方法用时：" + (endTime - startTime));
        return future;
    }

    private void sleep() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
