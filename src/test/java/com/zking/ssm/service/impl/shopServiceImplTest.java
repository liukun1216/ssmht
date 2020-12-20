package com.zking.ssm.service.impl;

import com.zking.ssm.model.Shop;
import com.zking.ssm.service.IShopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class shopServiceImplTest {
    @Autowired
    private IShopService service;
    @Test
    public void insert() {
        Shop shop=new Shop();
        shop.setUserid(2);
        shop.setShopaddress("这里");
        shop.setShopinfo("简介");
        shop.setShopname("名字");
        service.selectShop(shop);
    }
}