package cn.leijiba.spring.simpletransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String sql = "INSERT INTO USERS (name, age) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getAge());
    }

    // 查询所有用户
    public List<User> findAll() {
        String sql = "SELECT id, name, age FROM USERS";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            return user;
        });
    }
} 