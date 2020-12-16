package com.lx.microServices.api.service;

import com.lx.microServices.api.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author lx
 * @date 2020/12/16
 */
@FeignClient(value = "PROVIDER-DEPT")
public interface DeptClientService {

    /**
     * 添加部门
     * @param dept 部门信息
     * @return 是否成功
     */
    @PostMapping("/dept/add")
    Boolean add(Dept dept);

    /**
     * 根据编号 查询部门
     * @param id 编号
     * @return 查询结果
     */
    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable(value = "id") Long id);

    /**
     * 查找所有部门信息
     * @return 部门信息列表
     */
    @GetMapping("/dept/list")
    List<Dept> list();
}
