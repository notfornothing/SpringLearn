package com.example.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyLifecycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, EnvironmentAware,
        InitializingBean, DisposableBean {

    public MyLifecycleBean() {
        System.out.println("1. 构造函数执行");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2. BeanNameAware: Bean 名称是 " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3. BeanFactoryAware: BeanFactory 已设置");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4. ApplicationContextAware: ApplicationContext 已设置");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("5. EnvironmentAware: Environment 已设置");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("6. @PostConstruct 方法执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. InitializingBean.afterPropertiesSet() 方法执行");
    }

    public void initMethod() {
        System.out.println("8. 自定义初始化方法执行");
    }

    public void sayHello() {
        System.out.println("10. Bean 使用中...");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("11. @PreDestroy 方法执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("12. DisposableBean.destroy() 方法执行");
    }

    public void destroyMethod() {
        System.out.println("13. 自定义销毁方法执行");
    }
} 