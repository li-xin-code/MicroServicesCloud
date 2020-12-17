package com.lx.microServices.configServer9021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lx
 * @date 2020/12/16
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer9021Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer9021Application.class,args);
    }
}
