package com.ycproject.bookmanage.pojo.role;/*
 * @author      :  YC
 * @date        :  2024/9/22 17:01
 * @description :  some description
 */

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_role")
public class SysRole implements Serializable {
    private static final long serialVersionUID = 6517758992761622414L;
    /**
     * 角色编码
     */
    private String roleCode;
    /**
     * 角色名称
     */
    private String roleName;
}
