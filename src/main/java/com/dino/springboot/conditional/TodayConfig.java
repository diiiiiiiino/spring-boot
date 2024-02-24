package com.dino.springboot.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "today", havingValue = "on")
public class TodayConfig {

    @Bean
    public Today today(){
        return new Today();
    }
}
