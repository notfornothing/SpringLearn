package com.example.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean implements InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("1. 构造函数执行");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("3. @PostConstruct 方法执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4. InitializingBean.afterPropertiesSet() 方法执行");
    }

    public void initMethod() {
        System.out.println("5. 自定义初始化方法执行");
    }

    public void sayHello() {
        System.out.println("7. Bean 使用中...");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("8. @PreDestroy 方法执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9. DisposableBean.destroy() 方法执行");
    }

    public void destroyMethod() {
        System.out.println("10. 自定义销毁方法执行");
    }
} 