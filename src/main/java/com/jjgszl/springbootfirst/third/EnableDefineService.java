package com.jjgszl.springbootfirst.third;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
//动态注入的类CacheImportSelector.class
@Import({CacheImportSelector.class,LoggerRegister.class})
public @interface EnableDefineService {
    Class<?>[] exclude() default {};
}
