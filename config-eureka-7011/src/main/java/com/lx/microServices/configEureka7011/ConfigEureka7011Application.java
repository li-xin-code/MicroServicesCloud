package com.lx.microServices.configEureka7011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lx
 * @date 2020/12/17
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEureka7011Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEureka7011Application.class,args);
    }
}
