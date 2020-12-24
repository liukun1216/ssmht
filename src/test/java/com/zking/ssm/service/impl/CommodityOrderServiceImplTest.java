package com.zking.ssm.service.impl;

import com.zking.ssm.model.Commodity;
import com.zking.ssm.model.CommodityOrder;
import com.zking.ssm.model.CommodityOrderDetail;
import com.zking.ssm.model.ShoppingCart;
import com.zking.ssm.service.ICommodityOrderDetailService;
import com.zking.ssm.service.ICommodityOrderService;
import com.zking.ssm.service.ICommodityService;
import com.zking.ssm.service.IShoppingCartService;
import com.zking.ssm.util.OrderId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})

public class CommodityOrderServiceImplTest {
    @Autowired
    ICommodityOrderService service;

    @Autowired
    IShoppingCartService shoppingCartService;
    @Autowired
    ICommodityOrderDetailService commodityOrderDetailService;
    @Autowired
    ICommodityService commodityService;


    @Test
    public void listsy() {
        String orderCode = OrderId.getOrderCode((long) 1);
        ShoppingCart s = new ShoppingCart();
        s.setUserid(1);
        List<ShoppingCart> getcar = shoppingCartService.getcar(s);

        CommodityOrder c = new CommodityOrder();


        int commodityQuantity = 0;
        CommodityOrderDetail commodityOrderDetail = new CommodityOrderDetail();
        commodityOrderDetail.setOrderId(orderCode);
        int TotalAmount = 0;
        for (ShoppingCart sc : getcar) {
            Integer commodityid = sc.getCommodityid();

            Integer amount = sc.getAmount();

            int price = sc.getPrice();

            Commodity commodity = commodityService.selectByPrimaryKey(sc.getCommodityid());
            commodityOrderDetail.setCommodityId(commodity.getId());
            commodityOrderDetail.setCommodityName(commodity.getName());
            commodityOrderDetail.setCommodityPrice(commodity.getPrice());
            commodityOrderDetail.setCommodityQuantity(amount);
            commodityOrderDetailService.insert(commodityOrderDetail);


            commodityQuantity += amount;
            TotalAmount += price;
            shoppingCartService.deleteByPrimaryKey(sc.getId());
        }
        c.setCommodityQuantity(commodityQuantity);
        c.setTotalAmount(TotalAmount);
        c.setUserId(1);
        c.setStatus("待发货");
        c.setId(orderCode);
        int insert = service.insert(c);


    }
}