package cn.leijiba.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {
    @Autowired
    private SetterInjection setterInjection;

    public void performTask() {
        System.out.println("FieldInjection is performing a task.");
        setterInjection.help();
    }
} 