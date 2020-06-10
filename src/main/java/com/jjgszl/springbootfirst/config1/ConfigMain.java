package com.jjgszl.springbootfirst.config1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ConfigMain.class);
        for (String beanName : configApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

}
