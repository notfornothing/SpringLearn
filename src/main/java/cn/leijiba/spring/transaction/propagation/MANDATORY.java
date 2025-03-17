package cn.leijiba.spring.transaction.propagation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MANDATORY {

    @Transactional(propagation = Propagation.MANDATORY)
    public void execute() {
        // 强制事务
    }
} 