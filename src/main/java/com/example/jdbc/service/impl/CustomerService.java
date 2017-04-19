package com.example.jdbc.service.impl;

import com.example.jdbc.entity.Customer;
import com.example.jdbc.service.ICustomerService;
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
 * CustomerService.java
 * 创建人：李岸虹
 * 日期：2017-03-23 09:27
 * 描述：
 * 历史：
 */
@Service
public class CustomerService implements ICustomerService {

    @Resource(name = "secondaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomer() {
        return jdbcTemplate.query("SELECT id, username, age, sex FROM customer ORDER BY age DESC", new BeanPropertyRowMapper<Customer>(Customer.class));
    }

    @Override
    public Customer getCustomerById(String id) {
        return jdbcTemplate.query("SELECT id, username, age, sex FROM customer WHERE id = ?", new ResultSetExtractor<Customer>() {
            @Override
            public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
                rs.next();
                return new Customer(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
        }, id);
    }
}

