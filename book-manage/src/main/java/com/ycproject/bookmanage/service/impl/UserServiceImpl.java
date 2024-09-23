package com.ycproject.bookmanage.service.impl;

import com.ycproject.bookmanage.mapper.UserMapper;
import com.ycproject.bookmanage.pojo.user.User;
import com.ycproject.bookmanage.pojo.user.UserInfoVo;
import com.ycproject.bookmanage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author      :  YC
 * @date        :  2024/9/21 17:03
 * @description :  some description
 */
@Service
public class UserServiceImpl implements IUserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectByName(String userName) {
        return userMapper.selectByName(userName);
    }


    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public UserInfoVo queryUserRole(String userName) {
        return userMapper.queryUserRole(userName);
    }
}
