package com.example.jdbc.entity;

import java.io.Serializable;

/**
 * Copyright (C) 1990 2013 南京擎天科技集团
 * Customer.java
 * 创建人：李岸虹
 * 日期：2017-03-23 09:28
 * 描述：
 * 历史：
 */
public class Customer implements Serializable {

    private String id;

    private String userName;

    private Integer age;

    private Integer sex;

    public Customer() {}

    public Customer(String id, String userName, Integer age, Integer sex) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
