package com.dubbo.run;

import com.dubbo.service.OtherService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CompletableFuture;

public class ConsumerRun {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");

        OtherService otherService = (OtherService) context.getBean("otherService");

        long startTime = System.currentTimeMillis();

        CompletableFuture<String> doThirdFuture = otherService.doThird();
        CompletableFuture<String> doFourthFuture = otherService.doThird();

        long endTime = System.currentTimeMillis();
        System.out.println("两个同步操作共计用时：" + (endTime - startTime));

        doThirdFuture.whenComplete((result, exception) -> {
            if (exception != null) {
                exception.printStackTrace();
            }else {
                System.out.println("异步，doThird()获取到返回值：" + result);
            }
        });

        doFourthFuture.whenComplete((result, exception) -> {
            if (exception != null) {
                exception.printStackTrace();
            }else {
                System.out.println("异步，doFourth()获取到返回值：" + result);
            }
        });

        long endTime2 = System.currentTimeMillis();
        System.out.println("共计用时：" + (endTime2 - startTime));
    }
}
