package cn.leijiba.spring.transaction.propagation;

import cn.leijiba.spring.transaction.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class REQUIRED {

    @Autowired
    AccountDao dao;

    @Autowired
    REQUIRED required;
    
    
    @Transactional
    public void requiredMethod() {
        dao.appendMoney(1,2);
        required.m1();
        required.m2();
        throw new IndexOutOfBoundsException();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void m1() {
        dao.appendMoney(1,20);
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void m2() {
        dao.appendMoney(1,200);
        throw new RuntimeException();
    }
} 