package com.example.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceProxy {

    public static UserService createProxy(UserService userService) {
        return (UserService) Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                new Class[]{UserService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理：方法执行前 - " + method.getName());
                        Object result = method.invoke(userService, args);
                        System.out.println("JDK代理：方法执行后 - " + method.getName());
                        return result;
                    }
                });
    }
} 