package com.jjgszl.springbootfirst.third;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;


public class LoggerRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Class beanClass = LoggerServer.class;
        //要注入的Bean 包装成RootBeanDefinition
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(beanClass);
        //首字母小写
        String beanName = StringUtils.uncapitalize(beanClass.getSimpleName());
        registry.registerBeanDefinition(beanName,rootBeanDefinition);
    }
}
