package com.ycproject.bookmanage.controller;/*
 * @author      :  YC
 * @date        :  2024/9/21 17:03
 * @description :  some description
 */

import com.ycproject.bookmanage.common.Result;
import com.ycproject.bookmanage.common.ResultCodeEnum;
import com.ycproject.bookmanage.common.exception.CustomDefineException;
import com.ycproject.bookmanage.pojo.user.LoginQuery;
import com.ycproject.bookmanage.pojo.user.User;
import com.ycproject.bookmanage.pojo.user.UserInfoVo;
import com.ycproject.bookmanage.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "图书管理系统-后台登录管理")
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 登录服务
     *
     * @param query 请求入参
     * @return 响应信息
     */
    @ApiOperation(value = "登录接口")
    @PostMapping("/login")
    public Result<String> login(@RequestBody LoginQuery query) {
        String userName = query.getUserName();
        String password = query.getPassword();

        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            return Result.fail("用户名或密码不能为空!");
        }

        try {
            User user = userService.selectByName(query.getUserName());
            if (null == user) {
                return Result.fail("用户名或密码错误!");
            }
            if (!password.equals(user.getPassword())) {
                return Result.fail("密码错误!");
            }
        } catch (Exception e) {
            throw new CustomDefineException(ResultCodeEnum.SERVICE_ERROR, e.getMessage());
        }

        return Result.ok("登录成功!");
    }

    @ApiOperation(value = "信息接口")
    @GetMapping("/info")
    public Result<UserInfoVo> info() {
        UserInfoVo infoVo = new UserInfoVo();
        infoVo.setName("admin");
        infoVo.setRoles("[admin]");
        infoVo.setAvatar("https://oss.aliyuncs.com/aliyun_id_photo_bucket/default_handsome.jpg");
        return Result.ok(infoVo);
    }

    @ApiOperation(value = "退出接口")
    @PostMapping("/logout")
    public Result<String> logout() {
        return Result.ok();
    }

    /**
     * 注册服务
     *
     * @param query 请求入参
     * @return 响应信息
     */
    @ApiOperation(value = "注册接口")
    @PostMapping("/register")
    public Result<String> register(@RequestBody LoginQuery query) {
        String userName = query.getUserName();
        String password = query.getPassword();
        Integer roleId = query.getRoleId();

        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            return Result.fail("用户名或密码不能为空!");
        }

        //默认普通用户
        if (null == roleId) {
            query.setRoleId(2);
        }

        try {
            User user = userService.selectByName(userName);
            if (null != user) {
                return Result.fail("用户已存在!");
            }

            User userAdd = new User();
            userAdd.setUserName(userName);
            userAdd.setPassword(password);
            userAdd.setRoleId(roleId);
            int id = userService.addUser(userAdd);
            if (id > 0) {
                return Result.ok("注册成功!");
            }
        } catch (Exception e) {
            throw new CustomDefineException(ResultCodeEnum.SERVICE_ERROR, e.getMessage());
        }

        return Result.ok();
    }


}
