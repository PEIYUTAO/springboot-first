package com.jjgszl.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class SpringbootFirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstApplication.class, args);
        /**
         *   public synchronized StringBuffer append(String str) {
         *         toStringCache = null;
         *         super.append(str);
         *         return this;
         *     }
         */
        new StringBuffer().append("");

        new StringBuilder().append("");

    }

}
