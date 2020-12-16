package com.lx.microServices.consumerDeptFeign8082.controller;

import com.lx.microServices.api.entities.Dept;
import com.lx.microServices.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lx
 * @date 2020/12/13
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptControllerConsumer {

    @Autowired
    private DeptClientService deptService;

    @PostMapping("/add")
    public Boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable Long id) {
        return deptService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }
}
