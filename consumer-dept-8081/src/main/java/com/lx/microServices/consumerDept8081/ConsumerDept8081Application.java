package com.lx.microServices.consumerDept8081;

import com.lx.microServices.rule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author lx
 * @date 2020/12/13
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER-DEPT",configuration = RuleConfig.class)
public class ConsumerDept8081Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept8081Application.class,args);
    }
}
