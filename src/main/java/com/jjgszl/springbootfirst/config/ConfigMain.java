package com.jjgszl.springbootfirst.config;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.security.krb5.Config;

public class ConfigMain {
    public static void main(String[] args) {
        //一定要在AnnotationConfigApplicationContext的构造方法中传递被注解@Configuration 修饰的Class  ,是可变的参数
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        ConfigClass configClass = applicationContext.getBean(ConfigClass.class);
        System.out.println(configClass.sayHello());


    }

}
