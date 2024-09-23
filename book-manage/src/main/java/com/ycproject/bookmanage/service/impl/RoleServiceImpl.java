package com.ycproject.bookmanage.service.impl;/*
 * @author      :  YC
 * @date        :  2024/9/22 18:25
 * @description :  some description
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ycproject.bookmanage.mapper.RoleMapper;
import com.ycproject.bookmanage.pojo.role.SysRole;
import com.ycproject.bookmanage.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    private final RoleMapper roleMapper;

    @Autowired
    public RoleServiceImpl(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @Override
    public PageInfo<SysRole> queryRoleList(int pageNum, int pageSize, String roleName) {
        PageHelper.startPage(pageNum, pageSize);
        List<SysRole> roleList = roleMapper.queryRoleList(roleName);
        return new PageInfo<>(roleList);
    }

    @Override
    public boolean removeById(Long id) {
        return roleMapper.removeById(id);
    }

    @Override
    public boolean save(SysRole role) {
        return roleMapper.save(role);
    }

    @Override
    public int updateById(SysRole role) {
        return roleMapper.updateById(role);
    }

    @Override
    public SysRole getById(Long id) {
        return roleMapper.getById(id);
    }

    @Override
    public boolean removeByIds(List<Long> idList) {
        return roleMapper.removeByIds(idList);
    }
}
