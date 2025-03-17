package cn.leijiba.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserServiceCglibProxy {

    public static UserService createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("CGLIB代理：方法执行前 - " + method.getName());
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("CGLIB代理：方法执行后 - " + method.getName());
                return result;
            }
        });
        return (UserService) enhancer.create();
    }
} 