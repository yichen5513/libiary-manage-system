package com.ycproject.bookmanage.service;

import com.github.pagehelper.PageInfo;
import com.ycproject.bookmanage.pojo.role.SysRole;

public interface IRoleService {
    PageInfo<SysRole> queryRoleList(int pageNum, int pageSize, String roleName);

    boolean removeById(Long id);
}
