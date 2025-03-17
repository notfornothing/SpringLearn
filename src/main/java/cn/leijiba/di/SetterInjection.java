package cn.leijiba.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    private String message;

    // Setter 方法注入
    @Value("Hello from SetterInjection")
    public void setMessage(String message) {
        this.message = message;
    }

    public void help() {
        System.out.println("SetterInjection is helping with message: " + message);
    }
} 