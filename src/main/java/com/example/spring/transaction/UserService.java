package com.example.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void addUser(User user) {
        userDao.save(user);
        // 模拟异常，测试事务回滚
        if (user.getAge() < 0) {
            throw new IllegalArgumentException("年龄不能为负数");
        }
    }

    // 查询所有用户
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
} 