package com.lx.microServices.providerDeptHystrix8011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lx
 * @date 2020/12/15
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ProviderDeptHystrix8011Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDeptHystrix8011Application.class, args);
    }
}
