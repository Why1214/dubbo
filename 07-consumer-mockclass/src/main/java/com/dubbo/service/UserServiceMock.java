package com.dubbo.service;

public class UserServiceMock implements UserService {
    @Override
    public String findUserName(String userId) {
        return "没有该用户" + userId;
    }

    @Override
    public void updateUserName(String userId, String userName) {
        System.out.println("更新用户失败");
    }
}
