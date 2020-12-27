package com.zking.ssm.controller;

import com.zking.ssm.model.ShoppingCart;
import com.zking.ssm.service.IShoppingCartService;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopCartController {
    JsonData jsonData = new JsonData();
    @Autowired
    private IShoppingCartService shoppingCartService;

    @RequestMapping("/getcar")
    public Object getcar(ShoppingCart shoppingCart){

        List<ShoppingCart> getcar = shoppingCartService.getcar(shoppingCart);
        int zj=0;
        for (ShoppingCart s: getcar    ) {
            zj+=s.getPrice();
        }
        jsonData.setResult(getcar);
        jsonData.setCode(zj);
        return jsonData;
    }

    @RequestMapping("/delshop")
    public Object delshop(Integer id){

        int i = shoppingCartService.deleteByPrimaryKey(id);
        jsonData.setCode(i);
        return jsonData;
    }
}
