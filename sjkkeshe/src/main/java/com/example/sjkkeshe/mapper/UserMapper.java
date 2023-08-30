package com.example.sjkkeshe.mapper;

import com.example.sjkkeshe.controller.request.UserPageRequest;
import com.example.sjkkeshe.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
//一个接口类，用于查询user表的全部信息
public interface UserMapper {
//    @Select("select * from user")
    List<User> ListUsers();
    //通过sql进行查询，这是查询的最里层

    List<User> listByCondition(UserPageRequest userPageRequest);

    void save(User user);
}
