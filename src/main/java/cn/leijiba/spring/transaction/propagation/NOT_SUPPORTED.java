package cn.leijiba.spring.transaction.propagation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class NOT_SUPPORTED {

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void execute() {
        // 不支持事务
    }
} 