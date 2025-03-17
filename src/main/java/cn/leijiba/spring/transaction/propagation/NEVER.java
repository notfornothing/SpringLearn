package cn.leijiba.spring.transaction.propagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class NEVER {

    @Transactional(propagation = Propagation.NEVER)
    public void neverMethod() {
        // 这里可以添加具体的业务逻辑
        System.out.println("NEVER传播行为测试");
    }
} 