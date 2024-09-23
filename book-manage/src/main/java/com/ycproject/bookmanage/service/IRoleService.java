package com.ycproject.bookmanage.service;

import com.github.pagehelper.PageInfo;
import com.ycproject.bookmanage.pojo.role.SysRole;

import java.util.List;

public interface IRoleService {
    PageInfo<SysRole> queryRoleList(int pageNum, int pageSize, String roleName);

    boolean removeById(Long id);

    boolean save(SysRole role);

    int updateById(SysRole role);

    SysRole getById(Long id);

    boolean removeByIds(List<Long> idList);
}
