package com.aaa.biz;

import com.aaa.entity.Dept;
import com.aaa.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 陈建
 * @Date: 2020/5/29 0029 16:36
 * @Version 1.0
 */
public interface DeptBiz {
   List<Dept> selectAllDept();
   int deleptDeptByID( @Param("ids") List<String> ids);
   int insertSelective(Dept record);
   int deleteByPrimaryKey(Integer deptId);
   int updateByPrimaryKeySelective(Dept record);
   List<Dept> selectDept(String deptName,String status);
}
