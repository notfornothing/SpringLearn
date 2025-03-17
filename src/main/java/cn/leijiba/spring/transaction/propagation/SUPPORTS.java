package cn.leijiba.spring.transaction.propagation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class SUPPORTS {

    @Transactional(propagation = Propagation.SUPPORTS)
    public void execute() {
        // 支持事务
    }
} 