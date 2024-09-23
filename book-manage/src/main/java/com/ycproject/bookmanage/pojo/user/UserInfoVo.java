package com.ycproject.bookmanage.pojo.user;/*
 * @author      :  YC
 * @date        :  2024/9/22 16:34
 * @description :  some description
 */

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoVo implements Serializable {
    private static final long serialVersionUID = 3315457482050468577L;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 角色名称
     */
    private String roles;
    /**
     * 角色编码
     */
    private String name;
    /**
     * 登录人图片
     */
    private String avatar;
}
