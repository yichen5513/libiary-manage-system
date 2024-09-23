package com.ycproject.bookmanage;

import com.ycproject.bookmanage.mapper.UserMapper;
import com.ycproject.bookmanage.pojo.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class BookManageApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

}
