package cn.leijiba.di.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnotherService {
    private String message;

    // Setter 方法注入
    @Value("Hello from AnotherService")
    public void setMessage(String message) {
        this.message = message;
    }

    public void help() {
        System.out.println("AnotherService is helping with message: " + message);
    }
} 