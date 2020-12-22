package com.zking.ssm.controller;

import com.zking.ssm.model.Commodity;
import com.zking.ssm.model.Shop;
import com.zking.ssm.service.ICommodityService;
import com.zking.ssm.service.IShopService;
import com.zking.ssm.service.impl.CommodityServiceImpl;
import com.zking.ssm.service.impl.ShopServiceImpl;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private IShopService shopService=new ShopServiceImpl();
    @Autowired
    private ICommodityService commodityService=new CommodityServiceImpl();

    JsonData jsonData=new JsonData();

    @RequestMapping("/add")
    private Object addShop(Shop shop){

        int i = shopService.insert(shop);
        if (i<0) {
            jsonData.setCode(i);
            jsonData.setMessage("申请失败");
        }else {
            jsonData.setCode(i);
            jsonData.setMessage("申请成功");
        }
        return  jsonData;
    }

    @RequestMapping("/index")
    private  Object Shop(int shopId){
        Shop shop = shopService.selectByPrimaryKey(shopId);
        jsonData.setCode(1);
        jsonData.setMessage("查询成功");
        jsonData.setResult(shop);
        return jsonData;
    }

    @RequestMapping("/commodity")
    private Object Commodity(Commodity commodity){
        List<Commodity> commodities = commodityService.listByShopId(commodity);
        jsonData.setResult(commodities);

        return jsonData;
    }

}
