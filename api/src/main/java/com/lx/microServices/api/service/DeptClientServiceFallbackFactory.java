package com.lx.microServices.api.service;

import com.lx.microServices.api.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lx
 * @date 2020/12/16
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

//    @Override
//    public DeptClientService create(Throwable throwable) {
//        return new DeptClientServiceFallbackImpl();
//    }

    @Override
    public DeptClientService create(Throwable throwable)
    {
        return new DeptClientService() {
            @Override
            public Dept get(Long id)
            {
                return new Dept(id,"编号:" + id + "不存在","no this database in Mysql");
            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public Boolean add(Dept dept)
            {
                return false;
            }
        };
    }

}
