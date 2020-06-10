package com.jjgszl.springbootfirst.second.current;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SecondMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        for (String beanName : applicationContext.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

    }
}
