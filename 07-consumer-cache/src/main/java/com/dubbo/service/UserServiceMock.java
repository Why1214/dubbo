package com.dubbo.service;

public class UserServiceMock implements UserService {
    @Override
    public String getUserNameById(String id) {
        return "没有该用户";
    }

    @Override
    public void addUser(String userName) {
        System.out.println("添加失败");
    }
}
