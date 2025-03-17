package cn.leijiba.spring.transaction.propagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class REQUIRES_NEW {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewMethod() {
        // 这里可以添加具体的业务逻辑
        System.out.println("REQUIRES_NEW传播行为测试");
    }
} 