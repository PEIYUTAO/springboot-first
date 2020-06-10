package com.jjgszl.springbootfirst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationDemo {
    //默认是单列的
    @Bean
    @Scope
    public ConfigClass configClass(){
        return new ConfigClass();
    }
}
