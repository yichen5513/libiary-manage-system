package com.ycproject.bookmanage.mapper;

import com.ycproject.bookmanage.pojo.user.User;
import com.ycproject.bookmanage.pojo.user.UserInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectByName(String userName);

    int addUser(@Param("user") User user);

    UserInfoVo queryUserRole(String userName);
}
