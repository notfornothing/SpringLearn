package cn.leijiba.proxy.cglibproxy;

public class Main {
    public static void main(String[] args) {
        UserService proxy = UserServiceCglibProxy.createProxy();
        
        proxy.addUser("Alice");
        proxy.deleteUser("Bob");
    }
} 