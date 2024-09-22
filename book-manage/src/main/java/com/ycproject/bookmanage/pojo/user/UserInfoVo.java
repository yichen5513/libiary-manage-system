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
    private String roles;
    private String name;
    private String avatar;
}
