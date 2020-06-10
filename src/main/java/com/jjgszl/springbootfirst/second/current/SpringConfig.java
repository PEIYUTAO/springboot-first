package com.jjgszl.springbootfirst.second.current;

import com.jjgszl.springbootfirst.second.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
//导入其他的配置类
@Import(OtherConfig.class)
@Configuration
public class SpringConfig {
    @Bean
    public DefaultBean defaultBean(){
        return new DefaultBean();
    }
}
