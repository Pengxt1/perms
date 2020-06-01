package com.aaa.biz.impl;

import com.aaa.biz.RoleBiz;
import com.aaa.dao.RoleMapper;
import com.aaa.entity.Role;
import com.aaa.entity.User;
import com.aaa.shiro.ShiroUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Author: 陈建
 * @Date: 2020/5/29 0029 16:36
 * @Version 1.0
 */
@Service
public class RoleBizImpl implements RoleBiz {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> selectAllRole() {
        return roleMapper.selectAllRole();
    }

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer roleId){
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    /*@Override
    public int deleptDeptByID(List<String> ids) {
        return roleMapper.deleptByID(ids);
    }
    */
    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }
}
