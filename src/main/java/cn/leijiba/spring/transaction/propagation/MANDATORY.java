package cn.leijiba.spring.transaction.propagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MANDATORY {

    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryMethod() {
        // 这里可以添加具体的业务逻辑
        System.out.println("MANDATORY传播行为测试");
    }
} 