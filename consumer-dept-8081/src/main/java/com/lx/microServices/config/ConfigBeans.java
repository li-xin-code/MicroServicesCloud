package com.lx.microServices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lx
 * @date 2020/12/13
 */
@Configuration
public class ConfigBeans {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
