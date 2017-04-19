package com.example.jdbc.controller;

import com.example.jdbc.entity.User;
import com.example.jdbc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C) 1990 2013 南京擎天科技集团
 * UserController.java
 * 创建人：李岸虹
 * 日期：2017-03-20 11:09
 * 描述：
 * 历史：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("userList")
    public Object getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("userInfo/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }
}
