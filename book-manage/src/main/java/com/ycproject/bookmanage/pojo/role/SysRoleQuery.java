package com.ycproject.bookmanage.pojo.role;/*
 * @author      :  YC
 * @date        :  2024/9/22 17:00
 * @description :  some description
 */

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRoleQuery implements Serializable {
    private static final long serialVersionUID = -4248198320039491134L;
    /**
     * 角色名称
     */
    private String roleName;
}
