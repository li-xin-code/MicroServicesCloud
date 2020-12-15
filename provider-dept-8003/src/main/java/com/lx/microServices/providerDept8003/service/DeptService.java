package com.lx.microServices.providerDept8003.service;

import com.lx.microServices.api.entities.Dept;

import java.util.List;

/**
 * @author lx
 * @date 2020/12/13
 */
public interface DeptService {
    /**
     * 添加部门
     * @param dept 部门信息
     * @return 是否成功
     */
    Boolean add(Dept dept);

    /**
     * 根据编号 查询部门
     * @param id 编号
     * @return 查询结果
     */
    Dept get(Long id);

    /**
     * 查找所有部门信息
     * @return 部门信息列表
     */
    List<Dept> list();
}
