package com.ycproject.bookmanage.controller;
/*
 * @author      :  YC
 * @date        :  2024/9/22 16:06
 * @description :  some description
 */

import com.github.pagehelper.PageInfo;
import com.ycproject.bookmanage.common.Result;
import com.ycproject.bookmanage.pojo.role.SysRole;
import com.ycproject.bookmanage.pojo.role.SysRoleQuery;
import com.ycproject.bookmanage.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "图书管理系统-后台角色管理")
@RestController
@RequestMapping("/sysRole")
public class RoleController {
    private final IRoleService roleService;

    @Autowired
    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @ApiOperation(("条件分页查询"))
    @GetMapping("/{page}/{limit}")
    public Result<PageInfo<SysRole>> queryRoleList(@PathVariable int page, @PathVariable int limit, SysRoleQuery query) {
        PageInfo<SysRole> pageInfo = roleService.queryRoleList(page, limit, query.getRoleName());
        return Result.ok(pageInfo);
    }

    @ApiOperation("根据id删除")
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable Long id) {
        boolean isSuccess = roleService.removeById(id);
        if (isSuccess) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @ApiOperation("添加角色")
    @PostMapping("save")
    public Result save(@RequestBody SysRole role) {
        //调用service方法
        boolean isSuccess = roleService.save(role);
        if (isSuccess) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @ApiOperation("修改角色")
    @PutMapping("updateById")
    public Result updateById(@RequestBody SysRole role) {
        //调用service方法
        int effectRows = roleService.updateById(role);
        if (effectRows > 0) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @ApiOperation("根据id查询")
    @GetMapping("get/{id}")
    public Result getById(@PathVariable Long id) {
        //调用service方法
        SysRole sysRole = roleService.getById(id);
        return Result.ok(sysRole);
    }

    @ApiOperation("批量删除")
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long> idList) {
        boolean isSuccess = roleService.removeByIds(idList);
        if (isSuccess) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
}
