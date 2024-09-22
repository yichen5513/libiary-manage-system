package com.ycproject.bookmanage.pojo.user;/*
 * @author      :  YC
 * @date        :  2024/9/21 22:35
 * @description :  some description
 */

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginQuery implements Serializable {
    private static final long serialVersionUID = -4961549970854947802L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 角色ID 1-管理员 2-普通用户
     */
    private Integer roleId;
}
