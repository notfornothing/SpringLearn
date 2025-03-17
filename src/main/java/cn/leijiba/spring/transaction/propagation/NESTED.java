package cn.leijiba.spring.transaction.propagation;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class NESTED {

    @Transactional(propagation = Propagation.NESTED)
    public void execute() {
        // 嵌套事务
    }
} 