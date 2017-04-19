package com.example.jdbc.service.impl;

import com.example.jdbc.entity.User;
import com.example.jdbc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Copyright (C) 1990 2013 南京擎天科技集团
 * UserService.java
 * 创建人：李岸虹
 * 日期：2017-03-20 11:09
 * 描述：
 * 历史：
 */
@Service
public class UserService implements IUserService {

    @Resource(name = "primaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUser() {
        return jdbcTemplate.query("SELECT id, username, age, sex FROM user ORDER BY age DESC", new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public User getUserById(String id) {
        return jdbcTemplate.query("SELECT id, username, age, sex FROM user WHERE id = ?", new ResultSetExtractor<User>() {
            @Override
            public User extractData(ResultSet rs) throws SQLException, DataAccessException {
                rs.next();
                return new User(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
        }, id);
    }
}
