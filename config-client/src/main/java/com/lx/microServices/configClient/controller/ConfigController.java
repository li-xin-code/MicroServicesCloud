package com.lx.microServices.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lx
 * @date 2020/12/17
 */
@RestController
public class ConfigController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>(16);
        config.put("applicationName",applicationName);
        config.put("eurekaServers",eurekaServers);
        config.put("port",port);
        return config;
    }
}
