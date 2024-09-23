package com.ycproject.bookmanage.service;

import com.ycproject.bookmanage.pojo.user.User;
import com.ycproject.bookmanage.pojo.user.UserInfoVo;

public interface IUserService {
    User selectByName(String userName);

    int addUser(User user);

    UserInfoVo queryUserRole(String userName);
}
