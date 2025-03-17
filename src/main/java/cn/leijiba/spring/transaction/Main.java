package cn.leijiba.spring.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        AccountDao dao = context.getBean(AccountDao.class);
        dao.createAccount("1",1000);

        
        // 测试REQUIRED传播行为
        try {

            accountService.testRequired();
        }catch (Exception e) {
            System.out.println("catch:"+e);
        }finally {
            Integer salaryByName = dao.getSalaryByName(1);
            System.out.println(salaryByName);
        }
    }
} 