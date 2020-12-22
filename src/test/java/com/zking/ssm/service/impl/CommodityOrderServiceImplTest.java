package com.zking.ssm.service.impl;

import com.zking.ssm.service.ICommodityOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})

public class CommodityOrderServiceImplTest {
    @Autowired
    ICommodityOrderService service;
    @Test
    public void listsy() {
        List listsy = service.listsy();

    }
}