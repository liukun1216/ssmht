package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.ShippingAddressMapper;
import com.zking.ssm.model.ShippingAddress;
import com.zking.ssm.model.User;
import com.zking.ssm.service.IShippingAddressService;
import com.zking.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})

public class UserServiceImplTest {
    @Autowired
    private IUserService userService;
    @Autowired
    private IShippingAddressService shippingAddressService;

    @Test
    public void insert() {
        String s="1";
        User u = new User(null,s,s,s,s,s,s,s,s,s,null,null,s);

        userService.insert(u);

    }

    @Test
    public void upd() {
        User u = new User();
        u.setAccount("zs");
        u.setSex("女");
        int i = userService.updateByPrimaryKeySelective(u);
        System.out.println(i);
    }
    @Test
    public void add2() {
       ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setUserid(1);
        List<ShippingAddress> shippingAddresses = shippingAddressService.listByuserid(shippingAddress);
        System.out.println(shippingAddresses);
    }

}