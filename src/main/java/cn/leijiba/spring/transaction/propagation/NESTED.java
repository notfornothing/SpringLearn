package cn.leijiba.spring.transaction.propagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class NESTED {

    @Transactional(propagation = Propagation.NESTED)
    public void nestedMethod() {
        // 这里可以添加具体的业务逻辑
        System.out.println("NESTED传播行为测试");
    }
} 