package com.zking.ssm.service.impl;

import com.zking.ssm.model.User;
import com.zking.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})

public class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    public void insert() {
        String s="1";
        User u = new User(null,s,s,s,s,s,s,s,s,s,null,null);

        userService.insert(u);

    }
}