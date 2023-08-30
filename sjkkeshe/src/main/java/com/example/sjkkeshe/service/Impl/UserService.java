package com.example.sjkkeshe.service.Impl;

import com.example.sjkkeshe.controller.request.UserPageRequest;
import com.example.sjkkeshe.entity.User;
import com.example.sjkkeshe.mapper.UserMapper;
import com.example.sjkkeshe.service.IUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//实现IUserService
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> ListUsers() {
        return userMapper.ListUsers();//从controller进入到实现类里来
    }

    @Override
    public Object page(UserPageRequest userPageRequest){
        PageHelper.startPage(userPageRequest.getPageNum(), userPageRequest.getPageSize());//
        List<User> user = userMapper.listByCondition(userPageRequest);

//        PageInfo<User> userPageInfo = new PageInfo<>(user);
       return new PageInfo<>(user);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void updateUserBalance(String userName, int i) {

    }

}
