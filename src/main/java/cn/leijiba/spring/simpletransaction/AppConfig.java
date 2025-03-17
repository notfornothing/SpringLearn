package cn.leijiba.spring.simpletransaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "cn.leijiba.spring.simpletransaction")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost:9092/~/test");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        // 初始化数据库表
        jdbcTemplate.execute("DROP TABLE IF EXISTS USERS"); // 先删除已存在的表
        jdbcTemplate.execute("CREATE TABLE USERS (id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), age INT)");
//        System.out.println("数据库表 'USERS' 已创建");
        
        // 验证表是否成功创建
        Boolean tableExists = jdbcTemplate.queryForObject(
            "SELECT COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'USERS'", 
            Boolean.class);
//        System.out.println("Table USERS exists: " + tableExists);
        
        return jdbcTemplate;
    }
} 