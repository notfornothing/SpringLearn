package cn.leijiba.spring.transaction.propagation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class REQUIRED {

    @Transactional(propagation = Propagation.REQUIRED)
    public void execute() {
        // 默认事务传播行为
    }
} 