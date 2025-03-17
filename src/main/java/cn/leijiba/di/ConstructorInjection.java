package cn.leijiba.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    private SetterInjection setterInjection;

    // 构造器注入
    @Autowired
    public ConstructorInjection(SetterInjection setterInjection) {
        this.setterInjection = setterInjection;
    }

    public void performTask() {
        System.out.println("ConstructorInjection is performing a task.");
        setterInjection.help();
    }
} 