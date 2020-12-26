package com.zking.ssm.util;

import com.zking.ssm.model.Commodity;
import com.zking.ssm.model.CommodityOrder;
import com.zking.ssm.model.CommodityOrderDetail;
import com.zking.ssm.model.ShoppingCart;
import com.zking.ssm.service.ICommodityOrderDetailService;
import com.zking.ssm.service.ICommodityOrderService;
import com.zking.ssm.service.ICommodityService;
import com.zking.ssm.service.IShoppingCartService;
import com.zking.ssm.service.impl.CommodityOrderDetailServiceImpl;
import com.zking.ssm.service.impl.CommodityOrderServiceImpl;
import com.zking.ssm.service.impl.CommodityServiceImpl;
import com.zking.ssm.service.impl.ShoppingCartServiceImpl;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cs {
    @Autowired
    ICommodityService commodityService=new CommodityServiceImpl();
    @Autowired
    ICommodityOrderService commodityOrderService=new CommodityOrderServiceImpl();
    @Autowired
    IShoppingCartService shoppingCartService=new ShoppingCartServiceImpl();
    @Autowired
    ICommodityOrderDetailService commodityOrderDetailService=new CommodityOrderDetailServiceImpl();
    public void tess(List<Integer> ints) {
        Random r=new Random();
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
//                shoppingCartService.deleteByPrimaryKey(i);
            }

        }

        commodityOrder.setUserId(userid);
        commodityOrder.setStatus("订单已提交");
        commodityOrder.setCommodityQuantity(sl);
        commodityOrder.setTotalAmount(jg);
        int insert = commodityOrderService.insert(commodityOrder);
    }

    public static void main(String[] args) {
        List<Integer> lis=new ArrayList<Integer>();
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        lis.add(6);
        lis.add(7);
    }




}
