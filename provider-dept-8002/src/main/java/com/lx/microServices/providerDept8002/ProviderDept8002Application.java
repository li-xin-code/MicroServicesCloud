package com.lx.microServices.providerDept8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lx
 * @date 2020/12/15
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderDept8002Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8002Application.class, args);
    }
}
