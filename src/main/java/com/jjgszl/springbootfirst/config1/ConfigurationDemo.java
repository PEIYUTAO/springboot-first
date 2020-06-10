package com.jjgszl.springbootfirst.config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class ConfigurationDemo {
    public ConfigClass configClass(){
        return new ConfigClass();
    }
}
