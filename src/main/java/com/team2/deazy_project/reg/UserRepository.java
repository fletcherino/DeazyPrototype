package com.team2.deazy_project.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserRepository implements UserInterface {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(JdbcTemplate aTemplate) {
        jdbcTemplate = aTemplate;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder2() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    public boolean doesUserNameExist(String u) {
        return (jdbcTemplate.queryForList("select username from users where username = ?", new Object[]{u})).size() > 0;
    }

    private int _addToUserTable(User u){
        String sql = "insert into users(username, password, enabled) values(?,?,?)";
        return jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, u.getUsername());
                ps.setString(2, passwordEncoder2().encode(u.getPassword()));
                ps.setInt(3, 1);
                return ps;
            }
        });
    }

    private int _addToAuthoritiesTable(User u){
        String sql2 = "insert into authorities(username, authority) values(?,?)";
        return jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql2);
                ps.setString(1, u.getUsername());
                ps.setString(2, "ROLE_USER");
                return ps;
            }
        });
    }

    public boolean addUser(User u) {
        return _addToUserTable(u) > 0 && _addToAuthoritiesTable(u) > 0;
    }
}
