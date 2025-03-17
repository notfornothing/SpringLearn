package cn.leijiba.spring.transaction.propagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class NOT_SUPPORTED {

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedMethod() {
        // 这里可以添加具体的业务逻辑
        System.out.println("NOT_SUPPORTED传播行为测试");
    }
} 