package cn.leijiba.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer getSalaryByName(String name) {
        return jdbcTemplate.queryForObject("SELECT salary FROM ACCOUNT WHERE name = ?", Integer.class, name);
    }

    public void updateSalaryByName(String name, int amount) {
        jdbcTemplate.update("UPDATE ACCOUNT SET salary = salary + ? WHERE name = ?", amount, name);
    }

    public void createAccount(String name, int salary) {
        jdbcTemplate.update("INSERT INTO ACCOUNT (name, salary) VALUES (?, ?)", name, salary);
    }
} 