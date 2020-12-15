package com.lx.microServices.providerDept8001.dao;

import com.lx.microServices.api.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lx
 * @date 2020/12/13
 */
@Repository
@Mapper
public interface DeptDao {
    /**
     * 添加部门
     * @param dept 部门信息
     * @return 是否成功
     */
    Boolean addDept(Dept dept);

    /**
     * 根据编号 查询部门
     * @param id 编号
     * @return 查询结果
     */
    Dept findById(Long id);

    /**
     * 查找所有部门信息
     * @return 部门信息列表
     */
    List<Dept> findAll();
}
