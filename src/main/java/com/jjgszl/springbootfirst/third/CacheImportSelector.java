package com.jjgszl.springbootfirst.third;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class CacheImportSelector implements ImportSelector {
    //AnnotationMetadata注解中的元数据：注解中的数据就是元数据
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(EnableDefineService.class.getName());
        //写死了，返回一个固定的CacheService
        return new String[]{CacheService.class.getName()};
    }
}
