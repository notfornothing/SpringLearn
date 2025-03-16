package cn.leijiba.staticinheritproxy;

public class UserServiceStaticProxy extends UserService {
    @Override
    public void addUser(String username) {
        System.out.println("继承代理：方法执行前");
        super.addUser(username);
        System.out.println("继承代理：方法执行后");
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("继承代理：方法执行前");
        super.deleteUser(username);
        System.out.println("继承代理：方法执行后");
    }
} 