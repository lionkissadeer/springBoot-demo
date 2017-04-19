package com.example;

import com.example.jdbc.entity.Customer;
import com.example.jdbc.service.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ICustomerService customerService;

    @Test
    public void contextLoads() {
        for (Customer customer : customerService.getAllCustomer()) {
            System.out.println(customer.toString());
        }
    }
}
