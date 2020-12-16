package com.lx.microServices.zuulGateway9011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lx
 * @date 2020/12/16
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9011Application {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9011Application.class, args);
    }
}
