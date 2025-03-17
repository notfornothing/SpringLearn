package cn.leijiba.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.leijiba.di")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        ConstructorInjection constructorInjection = context.getBean(ConstructorInjection.class);
        constructorInjection.performTask();

        FieldInjection fieldInjection = context.getBean(FieldInjection.class);
        fieldInjection.performTask();
    }
} 