package cn.leijiba.spring.transaction.propagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SUPPORTS {

    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsMethod() {
        // 这里可以添加具体的业务逻辑
        System.out.println("SUPPORTS传播行为测试");
    }
} 