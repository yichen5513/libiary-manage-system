package com.ycproject.bookmanage.pojo.user;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/*
 * @author      :  YC
 * @date        :  2024/9/21 16:29
 * @description :  some description
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 7197010457666104486L;
    /**
     * 主键id
     */
    private Integer id;
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
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 更新时间
     */
    private Timestamp updateTime;
}
