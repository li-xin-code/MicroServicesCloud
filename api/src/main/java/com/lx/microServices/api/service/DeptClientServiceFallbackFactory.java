package com.lx.microServices.api.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author lx
 * @date 2020/12/16
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientServiceFallbackImpl();
    }

}
