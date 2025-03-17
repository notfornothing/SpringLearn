package cn.leijiba.spring.transaction.propagation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class NEVER {

    @Transactional(propagation = Propagation.NEVER)
    public void execute() {
        // 禁止事务
    }
} 