package com.lx.microServices.api.service;

import com.lx.microServices.api.entities.Dept;

import java.util.List;

/**
 * @author lx
 * @date 2020/12/16
 */
public class DeptClientServiceFallbackImpl implements DeptClientService {
    @Override
    public Boolean add(Dept dept) {
        return null;
    }

    @Override
    public Dept get(Long id) {
        return new Dept(id,"编号:" + id + "不存在","no this database in Mysql");
    }

    @Override
    public List<Dept> list() {
        return null;
    }
}
