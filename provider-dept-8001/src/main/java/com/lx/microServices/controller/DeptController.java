package com.lx.microServices.controller;

import com.lx.microServices.entities.Dept;
import com.lx.microServices.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lx
 * @date 2020/12/13
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    @Qualifier("discoveryClient")
    private DiscoveryClient client;

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

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println(list);
        List<ServiceInstance> instances = client.getInstances("PROVIDER-DEPT");
        instances.forEach(instance->{
            System.out.print(instance.getServiceId() + "\t");
            System.out.print(instance.getHost() + "\t");
            System.out.print(instance.getPort() + "\t");
            System.out.print(instance.getUri() + "\n");
        });
        return this.client;
    }
}
