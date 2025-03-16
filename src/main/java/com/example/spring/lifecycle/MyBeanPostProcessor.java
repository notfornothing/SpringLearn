package com.example.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            System.out.println("2. BeanPostProcessor.postProcessBeforeInitialization() 方法执行");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            System.out.println("6. BeanPostProcessor.postProcessAfterInitialization() 方法执行");
        }
        return bean;
    }
} 