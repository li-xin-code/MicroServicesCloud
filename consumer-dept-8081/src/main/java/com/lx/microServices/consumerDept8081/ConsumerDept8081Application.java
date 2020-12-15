package com.lx.microServices.consumerDept8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lx
 * @date 2020/12/13
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerDept8081Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept8081Application.class,args);
    }
}
