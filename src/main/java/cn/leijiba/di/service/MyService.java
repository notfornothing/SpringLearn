package cn.leijiba.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    private AnotherService anotherService;

    // 构造器注入
    @Autowired
    public MyService(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    public void performTask() {
        System.out.println("MyService is performing a task.");
        anotherService.help();
    }
} 