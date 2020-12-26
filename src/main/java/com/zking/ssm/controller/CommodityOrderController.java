package com.zking.ssm.controller;

import com.zking.ssm.model.*;
import com.zking.ssm.service.ICommodityOrderDetailService;
import com.zking.ssm.service.ICommodityOrderService;
import com.zking.ssm.service.ICommodityService;
import com.zking.ssm.service.IShoppingCartService;
import com.zking.ssm.service.impl.CommodityOrderDetailServiceImpl;
import com.zking.ssm.service.impl.CommodityOrderServiceImpl;
import com.zking.ssm.service.impl.CommodityServiceImpl;
import com.zking.ssm.service.impl.ShoppingCartServiceImpl;
import com.zking.ssm.util.JsonData;
import com.zking.ssm.util.OrderId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/comorder")
public class CommodityOrderController {
    @Autowired
    ICommodityService commodityService=new CommodityServiceImpl();
    @Autowired
    ICommodityOrderService commodityOrderService=new CommodityOrderServiceImpl();
    @Autowired
    IShoppingCartService shoppingCartService=new ShoppingCartServiceImpl();
    @Autowired
    ICommodityOrderDetailService commodityOrderDetailService=new CommodityOrderDetailServiceImpl();

    JsonData jsonData = new JsonData();
    //新增和修改
    @RequestMapping("/xgAndAd")
    public Object RegisterAndAmend(CommodityOrder commodityOrder){
        if(commodityOrder.getId()!=null){
            int i = commodityOrderService.updateByPrimaryKeySelective(commodityOrder);
            jsonData.setMessage("修改成功");
            jsonData.setCode(i);
        }else{
            commodityOrder.setStatus("正常");
            int i = commodityOrderService.insert(commodityOrder);
            jsonData.setMessage("增加成功");
            jsonData.setCode(i);
        }
        return jsonData;
    }
    //删除
    @RequestMapping("/dele")
    public Object delOrder(String id){
        int i = commodityOrderService.deleteByPrimaryKey(id);
        return jsonData;
    }

    @RequestMapping("/sele")
    public Object listAll(){
        List<CommodityOrder> list = commodityOrderService.listsy();
        jsonData.setMessage("查询成功");
        jsonData.setResult(list);
        jsonData.setCode(0);
        return jsonData;
    }
    @RequestMapping("/dansele")
    public Object listdange(String id){
        List<CommodityOrder> list =commodityOrderService.listbyid(id);
        jsonData.setMessage("");
        jsonData.setResult(list);
        jsonData.setCode(0);
        return jsonData;
    }


    public void test3(List<ShoppingCart> getcar,User user){
        String orderCode = OrderId.getOrderCode((long) user.getId());
        CommodityOrder commodityOrder=new CommodityOrder();
        commodityOrder.setId(orderCode);
        int userid=user.getId();
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
                b=true;
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
//                shoppingCartService.deleteByPrimaryKey(sc.getId());
            }
        }
        commodityOrder.setUserId(userid);
        commodityOrder.setStatus("订单已提交");
        commodityOrder.setCommodityQuantity(sl);
        commodityOrder.setTotalAmount(jg);
        commodityOrder.setShopId(Shopid);
        int insert = commodityOrderService.insert(commodityOrder);

        if(b){
            test3(car,user);
        }
    }

    @RequestMapping("/ddtj")
    public Object tess(User u) {
        ShoppingCart cart=new ShoppingCart();
        cart.setUserid(u.getId());
        AlipayController alipayController=new AlipayController();
        List<ShoppingCart> getcar = shoppingCartService.getcar(cart);
        System.out.println(getcar);
        test3(getcar,u);
        return jsonData;
    }



}