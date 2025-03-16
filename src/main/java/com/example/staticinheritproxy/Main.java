package com.example.staticinheritproxy.;

public class Main {
    public static void main(String[] args) {
        UserService proxy = new UserServiceStaticProxy();
        
        proxy.addUser("Alice");
        proxy.deleteUser("Bob");
    }
}  