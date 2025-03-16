package cn.leijiba.spring.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        // 正常添加用户
        User user1 = new User();
        user1.setName("Alice");
        user1.setAge(25);
        userService.addUser(user1);
        
        // 查询并打印所有用户
        printUsers(userService.getAllUsers());

        // 添加用户时触发异常，测试事务回滚
        User user2 = new User();
        user2.setName("Bob");
        user2.setAge(-1);
        try {
            userService.addUser(user2);
        } catch (Exception e) {
            System.out.println("捕获异常: " + e.getMessage());
        }

        // 查询并打印所有用户
        printUsers(userService.getAllUsers());
    }

    // 封装打印用户信息的方法
    private static void printUsers(List<User> users) {
        System.out.println("所有用户信息：");
        users.forEach(user -> System.out.println("ID: " + user.getId() + 
            ", Name: " + user.getName() + 
            ", Age: " + user.getAge()));
    }
} 