package com.example.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyLifecycleBean myLifecycleBean = context.getBean(MyLifecycleBean.class);
        myLifecycleBean.sayHello();

        // 关闭上下文，触发销毁方法
        ((AnnotationConfigApplicationContext) context).close();
    }
} 