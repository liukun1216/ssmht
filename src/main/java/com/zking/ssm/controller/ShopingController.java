package com.zking.ssm.controller;

import com.zking.ssm.mapper.ShopMapper;
import com.zking.ssm.model.ShoppingCart;
import com.zking.ssm.service.IShoppingCartService;
import com.zking.ssm.service.impl.ShoppingCartServiceImpl;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoping")
public class ShopingController {
    JsonData jsonData=new JsonData();
    @Autowired
    private IShoppingCartService shoppingCartService=new ShoppingCartServiceImpl();
@RequestMapping("/add")
    private Object add(ShoppingCart shoppingCart){
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
        int i = shoppingCartService.updateByPrimaryKeySelective(s3);
        jsonData.setCode(i);

    }else{
        int i = shoppingCartService.insert(s);
        jsonData.setCode(i);

    }
        return jsonData;
    }
}
