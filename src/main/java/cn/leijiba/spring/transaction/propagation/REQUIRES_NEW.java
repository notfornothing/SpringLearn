package cn.leijiba.spring.transaction.propagation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class REQUIRES_NEW {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void execute() {
        // 新建事务
    }
} 