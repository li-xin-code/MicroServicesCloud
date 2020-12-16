package com.lx.microServices.config9021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lx
 * @date 2020/12/16
 */
@SpringBootApplication
@EnableConfigServer
public class Config9021Application {
    public static void main(String[] args) {
        SpringApplication.run(Config9021Application.class,args);
    }
}
