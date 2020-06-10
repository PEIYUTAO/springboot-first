package com.jjgszl.springbootfirst.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDefineService(exclude = {LoggerServer.class})
public class EnableDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(EnableDemo.class);
        CacheService cacheService = configurableApplicationContext.getBean(CacheService.class);
        LoggerServer loggerServer = configurableApplicationContext.getBean(LoggerServer.class);
        System.out.println(cacheService);
        System.out.println(loggerServer);

    }
}
