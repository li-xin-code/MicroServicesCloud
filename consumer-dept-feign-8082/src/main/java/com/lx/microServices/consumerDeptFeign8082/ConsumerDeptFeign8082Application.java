package com.lx.microServices.consumerDeptFeign8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lx
 * @date 2020/12/16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lx.microServices"})
@ComponentScan("com.lx.microServices")
public class ConsumerDeptFeign8082Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptFeign8082Application.class, args);
    }
}
