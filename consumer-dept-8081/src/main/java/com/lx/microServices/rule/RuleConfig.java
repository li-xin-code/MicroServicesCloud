package com.lx.microServices.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lx
 * @date 2020/12/15
 */
@Configuration
public class RuleConfig {

    @Bean
    public IRule deptRule(){
        return new Rule();
    }
}
