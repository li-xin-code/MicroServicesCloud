package com.lx.microServices.configProviderDept8021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lx
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigProviderDept8021Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigProviderDept8021Application.class, args);
    }
}
