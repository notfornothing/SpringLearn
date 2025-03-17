package cn.leijiba.proxy.jdkproxy;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService proxy = UserServiceProxy.createProxy(userService);
        
        proxy.addUser("Alice");
        proxy.deleteUser("Bob");
        
        
        userService.addUser("asdf");
    }
} 