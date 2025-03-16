package cn.leijiba.staticinterfaceproxy;

public class UserServiceStaticProxy implements UserService {
    private UserService userService;

    public UserServiceStaticProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void addUser(String username) {
        System.out.println("接口代理：方法执行前");
        userService.addUser(username);
        System.out.println("接口代理：方法执行后");
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("接口代理：方法执行前");
        userService.deleteUser(username);
        System.out.println("接口代理：方法执行后");
    }
} 