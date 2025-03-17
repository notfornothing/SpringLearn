package cn.leijiba.proxy.staticinterfaceproxy;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService proxy = new UserServiceStaticProxy(userService);
        
        proxy.addUser("Alice");
        proxy.deleteUser("Bob");
    }
} 