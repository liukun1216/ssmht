package com.zking.ssm.service.impl;

import com.zking.ssm.model.Commodity;
import com.zking.ssm.model.Shop;
import com.zking.ssm.service.ICommodityService;
import com.zking.ssm.service.IShopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class shopServiceImplTest {
    @Autowired
    private IShopService service;

    @Autowired
    private ICommodityService commodityService;
    @Test
    public void insert() {
        Commodity c=new Commodity();
        c.setTypeId(1);
        c.setshopId(2);

        commodityService.listBytype(c);

    }
}