package cn.leijiba.spring.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyBeanFactoryBean myBean() {
        return new MyBeanFactoryBean();
    }
} 