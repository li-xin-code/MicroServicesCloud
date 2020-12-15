package com.lx.microServices.providerDept8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lx
 * @date 2020/12/13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderDept8001Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001Application.class, args);
    }
}
