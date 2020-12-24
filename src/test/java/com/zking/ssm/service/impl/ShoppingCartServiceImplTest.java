package com.zking.ssm.service.impl;

import com.zking.ssm.model.ShoppingCart;
import com.zking.ssm.service.IShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})

public class ShoppingCartServiceImplTest {
    @Autowired
    private IShoppingCartService shoppingCartService;

    @Test
    public void insert() {
        ShoppingCart s=new ShoppingCart();
        s.setUserid(2);
        s.setCommodityid(2);
        s.setAmount(2);
        s.setPrice(400);

        ShoppingCart s2=new ShoppingCart();
        s2.setUserid(s.getUserid());
        s2.setCommodityid(s.getCommodityid());
        ShoppingCart s3 = shoppingCartService.get(s2);
        if(null!=s3){
            Integer amount = s.getAmount()+s3.getAmount();
            Integer price = s.getPrice()+s3.getPrice();
            s3.setAmount(amount);
            s3.setPrice(price);
            shoppingCartService.updateByPrimaryKeySelective(s3);

        }else{
            shoppingCartService.insert(s);

        }
    }
}