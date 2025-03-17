package cn.leijiba.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void transferSalaryByName(String fromAccountName, String toAccountName, int amount) {
        // 查询转出账户薪资
        Integer fromSalary = accountDao.getSalaryByName(fromAccountName);
        if (fromSalary < amount) {
            throw new RuntimeException("Insufficient salary");
        }

        // 更新转出账户薪资
        accountDao.updateSalaryByName(fromAccountName, -amount);

        // 更新转入账户薪资
        accountDao.updateSalaryByName(toAccountName, amount);
    }
} 