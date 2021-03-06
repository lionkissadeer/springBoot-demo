package com.example.jdbc.controller;

import com.example.jdbc.entity.Customer;
import com.example.jdbc.service.ICustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

    @Resource
    private ICustomerService customerService;

    @GetMapping("customerList")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("customerInfo/{id}")
    public Customer getCustomerById(@PathVariable("id") String id) {
        return customerService.getCustomerById(id);
    }

}
