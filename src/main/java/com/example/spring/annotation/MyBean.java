package com.example.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public void sayHello() {
        System.out.println("Hello, 注解配置的Spring Bean!");
    }
} 