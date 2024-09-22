package com.ycproject.bookmanage.service;

import com.ycproject.bookmanage.pojo.user.User;

public interface IUserService {
    User selectByName(String userName);

    int addUser(User user);
}
