package com.dubbo.service;

public interface UserService {

    String findUserName(String userId);

    void updateUserName(String userId, String userName);
}
