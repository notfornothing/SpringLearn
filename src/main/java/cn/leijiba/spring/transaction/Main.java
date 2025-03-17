package cn.leijiba.spring.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        AccountDao accountDao = context.getBean(AccountDao.class);

        // 初始化账户
        accountDao.createAccount("Alice", 1000);
        accountDao.createAccount("Bob", 500);

        // 打印初始化账户信息
        System.out.println("初始化账户信息：");
        System.out.println("Alice's salary: " + accountDao.getSalaryByName("Alice"));
        System.out.println("Bob's salary: " + accountDao.getSalaryByName("Bob"));

        // 转账
        accountService.transferSalaryByName("Alice", "Bob", 200);

        // 查询结果
        System.out.println("转账后账户信息：");
        Integer aliceSalary = accountDao.getSalaryByName("Alice");
        Integer bobSalary = accountDao.getSalaryByName("Bob");
        System.out.println("Alice's salary: " + aliceSalary);
        System.out.println("Bob's salary: " + bobSalary);
    }
} 