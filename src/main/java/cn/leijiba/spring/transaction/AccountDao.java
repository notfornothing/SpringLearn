package cn.leijiba.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 创建账户
    public void createAccount(String name, int salary) {
        String sql = "INSERT INTO account (name, salary) VALUES (?, ?)";
        jdbcTemplate.update(sql, name, salary);
    }

    // 根据姓名获取账户余额
    public Integer getSalaryByName(String name) {
        String sql = "SELECT salary FROM account WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, name);
    }

    public Integer getSalaryByName(Integer name) {
        String sql = "SELECT salary FROM account WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, name.toString());
    }

    // 从账户减少金额
    public void reduceMoney(String name, int amount) {
        String sql = "UPDATE account SET salary = salary - ? WHERE name = ?";
        jdbcTemplate.update(sql, amount, name);
    }

    // 向账户增加金额
    public void appendMoney(String name, int amount) {
        String sql = "UPDATE account SET salary = salary + ? WHERE name = ?";
        jdbcTemplate.update(sql, amount, name);
    }

    public void appendMoney(Integer name, int amount) {
        String sql = "UPDATE account SET salary = salary + ? WHERE name = ?";
        jdbcTemplate.update(sql, amount, name.toString());
    }
} 