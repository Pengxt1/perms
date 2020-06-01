package com.aaa.biz.impl;

import com.aaa.biz.DeptBiz;
import com.aaa.dao.DeptMapper;
import com.aaa.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 陈建
 * @Date: 2020/5/29 0029 16:49
 * @Version 1.0
 */
@Service
public class DeptBizImpl implements DeptBiz {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> selectAllDept() {
        return deptMapper.selectAllDept();
    }

    @Override
    public int deleptDeptByID(List<String> ids) {
        return deptMapper.deleptByID(ids);
    }

    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer deptId) {
        return deptMapper.deleteByPrimaryKey(deptId);
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Dept> selectDept(String deptName,String status) {
        return deptMapper.selectDept(deptName,status);
    }
}
