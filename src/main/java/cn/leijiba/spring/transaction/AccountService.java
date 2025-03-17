package cn.leijiba.spring.transaction;

import org.springframework.stereotype.Service;

public interface AccountService {
    void transferSalaryByName(String fromAccountName, String toAccountName, int amount);
} 