package com.zking.ssm.service.impl;

import com.zking.ssm.model.Commodity;
import com.zking.ssm.service.ICommodityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})

public class CommodityServiceImplTest {
    @Autowired
    private ICommodityService commodityService;

    @Test
    public void listByShopId() {
        Commodity commodity=new Commodity();
        commodity.setShopId(1);
        commodityService.listByShopId(commodity);
    }
}