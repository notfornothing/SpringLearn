package cn.leijiba.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    private String message;
    private AnotherService anotherService;

    // @Value Setter 方法注入
    @Value("Hello from SetterInjection")
    public void setMessage(String message) {
        this.message = message;
    }

    // @Autowired Setter 方法注入
    @Autowired
    public void setAnotherService(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    public void help() {
        System.out.println("SetterInjection is helping with message: " + message);
        anotherService.assist();
    }
} 