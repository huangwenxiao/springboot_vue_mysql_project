package com.example.sjkkeshe.service;

import com.example.sjkkeshe.controller.request.UserPageRequest;
import com.example.sjkkeshe.entity.User;

import java.util.List;

//业务处理层，用于操作数据库
public interface IUserService {
    List<User> ListUsers();

    Object page(UserPageRequest userPageRequest);

    void save(User user);

    void updateUserBalance(String userName, int i);
}
