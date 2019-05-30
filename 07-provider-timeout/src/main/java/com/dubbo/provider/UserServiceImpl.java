package com.dubbo.provider;

import com.dubbo.service.UserService;

import java.util.concurrent.TimeUnit;

public class UserServiceImpl implements UserService {
    @Override
    public String getUserNameById(String id) {
        System.out.println("run in getUserNameById");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "张三";
    }

    @Override
    public void addUser(String userName) {
        System.out.println("添加成功");
    }
}
