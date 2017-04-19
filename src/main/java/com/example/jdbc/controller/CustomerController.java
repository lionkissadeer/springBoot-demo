package com.example.jdbc.controller;

import com.example.jdbc.entity.Customer;
import com.example.jdbc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (C) 1990 2013 南京擎天科技集团
 * CustomerController.java
 * 创建人：李岸虹
 * 日期：2017-03-20 11:27
 * 描述：
 * 历史：
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping("customerList")

    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @RequestMapping("customerInfo/{id}")
    public Customer getCustomerById(@PathVariable("id") String id) {
        return customerService.getCustomerById(id);
    }

}
