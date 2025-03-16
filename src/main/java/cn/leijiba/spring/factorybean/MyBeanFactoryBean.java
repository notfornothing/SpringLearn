package cn.leijiba.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactoryBean implements FactoryBean<MyBean> {

    @Override
    public MyBean getObject() throws Exception {
        // 自定义创建 MyBean 的逻辑
        MyBean myBean = new MyBean();
        myBean.setMessage("通过 FactoryBean 创建的 MyBean");
        return myBean;
    }

    @Override
    public Class<?> getObjectType() {
        return MyBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true; // 单例模式
    }
} 