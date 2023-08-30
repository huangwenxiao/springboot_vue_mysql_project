package com.example.sjkkeshe.controller;

import com.example.sjkkeshe.common.Result;
import com.example.sjkkeshe.controller.request.UserPageRequest;
import com.example.sjkkeshe.entity.User;
import com.example.sjkkeshe.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
@RequestMapping("/user")//处理请求，统一前缀
@RestController //标注他是一个rest风格的controller
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/adduser")
    public Result save(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    @GetMapping("/list")
    //用户请求到达这个端口
//    public List<User> listUser(){
//        return userService.ListUsers();//调用这个方法
//
//    }
    public Result listUser(){
        List<User> user = userService.ListUsers();//调用这个方法
        return Result.success(user);

    }
    @GetMapping("/page")
    public Result page(UserPageRequest userPageRequest){
        return Result.success(userService.page(userPageRequest));
    }

}
