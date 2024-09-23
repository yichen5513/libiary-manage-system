package com.ycproject.bookmanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ycproject.bookmanage.pojo.role.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper extends BaseMapper<SysRole> {
    List<SysRole> queryRoleList(String roleName);

    boolean removeById(Long id);

    boolean save(SysRole role);
}
