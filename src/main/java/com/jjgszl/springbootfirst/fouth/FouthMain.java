package com.jjgszl.springbootfirst.fouth;

//import com.jjgszl.JJGSZLConfig;
//import com.jjgszl.JJGSZLCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class FouthMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(FouthMain.class);
//        System.out.println(configurableApplicationContext.getBean(JJGSZLCore.class));
    }
}
