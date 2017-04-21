package com.example.jdbc.controller;

import com.example.jdbc.entity.User;
import com.example.jdbc.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @Resource
    private IUserService userService;

    @RequestMapping("userList")
    public Object getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("userInfo/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @PostMapping("adduser")
    public void addUser(@RequestBody User user) {
        System.out.println(user.toString());
    }
}
