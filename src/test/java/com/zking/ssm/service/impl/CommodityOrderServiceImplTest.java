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
import com.zking.ssm.util.cs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        int ShopId = 0;
        CommodityOrder c = new CommodityOrder();
        int commodityQuantity = 0;
        CommodityOrderDetail commodityOrderDetail = new CommodityOrderDetail();
        commodityOrderDetail.setOrderId(orderCode);
        int TotalAmount = 0;
        for (ShoppingCart sc : getcar) {

            Integer amount = sc.getAmount();

            int price = sc.getPrice();

            Commodity commodity = commodityService.selectByPrimaryKey(sc.getCommodityid());
            int shopid = commodity.getshopId();

            if (ShopId != 0 && shopid != ShopId) {


            }

            ShopId = commodity.getshopId();
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

    public void test3(List<ShoppingCart> getcar){
        Random r=new Random(10);
        String orderCode = OrderId.getOrderCode(r.nextLong());
        CommodityOrder commodityOrder=new CommodityOrder();
        commodityOrder.setId(orderCode);
        int userid=0;
        int sl=0;//总数
        int jg=0;//总价
        int Shopid=0;
        List<ShoppingCart> car = new ArrayList<ShoppingCart>();
        boolean b=false;
        for (ShoppingCart sc : getcar) {
            Integer commodityid = sc.getCommodityid();
            Integer amount = sc.getAmount();
            int price = sc.getPrice();

            Commodity c= commodityService.selectByPrimaryKey(sc.getCommodityid());
            int shopid = c.getshopId();

            if (Shopid != 0 && shopid != Shopid) {
                car.add(sc);

            }else{
                Shopid=shopid;
                CommodityOrderDetail commodityOrderDetail=new CommodityOrderDetail();
                commodityOrderDetail.setCommodityId(c.getId());
                commodityOrderDetail.setOrderId(orderCode);
                commodityOrderDetail.setCommodityName(c.getName());
                commodityOrderDetail.setCommodityPrice(c.getPrice());
                commodityOrderDetail.setCommodityQuantity(sc.getAmount());
                commodityOrderDetailService.insert(commodityOrderDetail);
                sl+=sc.getAmount();
                jg+=sc.getPrice();
                shoppingCartService.deleteByPrimaryKey(sc.getId());
            }
        }
        commodityOrder.setUserId(userid);
        commodityOrder.setStatus("订单已提交");
        commodityOrder.setCommodityQuantity(sl);
        commodityOrder.setTotalAmount(jg);
        int insert = service.insert(commodityOrder);

        if(b){
            test3(car);
        }
    }

    @Test
    public void tess(List<Integer> ints) {
        Random r=new Random(10);
        String orderCode = OrderId.getOrderCode(r.nextLong());
        CommodityOrder commodityOrder=new CommodityOrder();
        commodityOrder.setId(orderCode);
        int userid=0;
        int sl=0;//总数
        int jg=0;//总价
        int Shopid=0;
        List<ShoppingCart> car = new ArrayList<ShoppingCart>();
        List<Integer> list=new ArrayList<Integer>();
        boolean b=false;
        for (int i : ints) {
            ShoppingCart s = shoppingCartService.selectByPrimaryKey(i);
            Integer commodityid = s.getCommodityid();
            userid=s.getUserid();
            Commodity c = commodityService.selectByPrimaryKey(commodityid);
            Integer shopid = c.getshopId();
            if(Shopid!=0&&Shopid!=shopid){
                b=true;
                list.add(i);
            }else{
                Shopid=shopid;
                CommodityOrderDetail commodityOrderDetail=new CommodityOrderDetail();
                commodityOrderDetail.setCommodityId(c.getId());
                commodityOrderDetail.setOrderId(orderCode);
                commodityOrderDetail.setCommodityName(c.getName());
                commodityOrderDetail.setCommodityPrice(c.getPrice());
                commodityOrderDetail.setCommodityQuantity(s.getAmount());
                commodityOrderDetailService.insert(commodityOrderDetail);
                sl+=s.getAmount();
                jg+=s.getPrice();
                shoppingCartService.deleteByPrimaryKey(i);
            }

        }

        commodityOrder.setUserId(userid);
        commodityOrder.setStatus("订单已提交");
        commodityOrder.setCommodityQuantity(sl);
        commodityOrder.setTotalAmount(jg);
        int insert = service.insert(commodityOrder);


    }
    @Test
    public void tsese(){
        List<Integer> lis=new ArrayList<Integer>();
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        lis.add(6);
        lis.add(7);
        cs c=new cs();
        c.tess(lis);
    }
}