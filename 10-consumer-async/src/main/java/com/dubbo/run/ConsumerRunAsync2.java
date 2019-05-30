package com.dubbo.run;

import com.dubbo.service.OtherService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ConsumerRunAsync2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");

        OtherService otherService = (OtherService) context.getBean("otherService");

        long startTime = System.currentTimeMillis();

        String doThird = otherService.doThird();
        System.out.println("异步，doThird()直接获取到返回值：" + doThird);
        Future<String> thirdFuture = RpcContext.getContext().getFuture();

        String doFourth = otherService.doFourth();
        System.out.println("异步，doFourth()直接获取到返回值：" + doFourth);
        Future<String> fourthFuture = RpcContext.getContext().getFuture();

        // 阻塞
        String doThird2 = thirdFuture.get();
        System.out.println("异步，doThird()第二次获取到返回值：" + doThird2);

        String doFourth2 = thirdFuture.get();
        System.out.println("异步，doFourth()第二次获取到返回值：" + doFourth2);


        long endTime = System.currentTimeMillis();

        System.out.println("两个同步操作共计用时：" + (endTime - startTime));
    }
}
