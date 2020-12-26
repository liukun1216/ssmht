package com.zking.ssm.controller;

import com.zking.ssm.model.CommodityOrder;
import com.zking.ssm.model.Log;
import com.zking.ssm.model.User;
import com.zking.ssm.service.ICommodityOrderService;
import com.zking.ssm.service.ILogService;
import com.zking.ssm.service.IShopService;
import com.zking.ssm.mapper.ShippingAddressMapper;
import com.zking.ssm.model.ShippingAddress;
import com.zking.ssm.model.User;
import com.zking.ssm.service.IShippingAddressService;
import com.zking.ssm.service.IUserService;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private ICommodityOrderService commodityOrderService;

    @Autowired
    private IShopService shopService;

    @Autowired
    private ILogService logService;

    @Autowired
    private IShippingAddressService shippingAddressService;
    JsonData jsonData;


    //    @GetMapping("/login")
    //
    @RequestMapping("/login")
    public Object login(User user) {

        jsonData = new JsonData();
        User u1 = userService.listByAccountAndPassword(user);

        if (null == u1 || !u1.getPassword().equals(user.getPassword())) {
            User u2 = userService.listByPhoneAndPassword(user);
            if (null == u2 || !u2.getPassword().equals(user.getPassword())) {
                jsonData.setMessage("帐号或密码错误");
                jsonData.setCode(-1);
            } else {
                jsonData.setCode(0);
                jsonData.setMessage("登陆成功");
                jsonData.setResult(u2);
            }
        } else {

            jsonData.setCode(0);
            jsonData.setResult(u1);
            jsonData.setMessage("登陆成功");
        }
        return jsonData;
    }

    //新增和修改
    @RequestMapping("/RsAndAd")
    public Object RegisterAndAmend(User user) {
        jsonData = new JsonData();
        if (user.getId() != null) {
            int i = userService.updateByPrimaryKeySelective(user);
            jsonData.setMessage("修改成功");
            jsonData.setCode(i);

        } else {
            user.setStatus("正常");
            int i = userService.insert(user);
            jsonData.setMessage("注册成功");
            jsonData.setCode(i);
        }

        return jsonData;
    }

    //通过账号或者手机号
    @RequestMapping("/listByAccountAndPhone")
    public Object listByAccountAndPhone(User user) {
        jsonData = new JsonData();

        User user1 = userService.listByAccountAndPhone(user);
        jsonData.setCode(0);
        jsonData.setResult(user1);
        return jsonData;
    }
    //收获地址增加
    @RequestMapping("/Addaddress")
    public Object Addaddress(ShippingAddress shippingAddress){
        jsonData = new JsonData();

        int insert = shippingAddressService.insert(shippingAddress);
        jsonData.setCode(insert);
        return jsonData;
    }
    //通过用户id查询收获地址
    @RequestMapping("/listByuserid")
    public Object listByuserid(ShippingAddress shippingAddress){
        jsonData = new JsonData();

        List<ShippingAddress> shippingAddressMappers = shippingAddressService.listByuserid(shippingAddress);

        jsonData.setCode(0);
        jsonData.setResult(shippingAddressMappers);

        return jsonData;
    }

    //通过收获地址表id删除
    @RequestMapping("/delid")
    private  Object delid(int id){
        jsonData = new JsonData();

        int i = shippingAddressService.deleteByPrimaryKey(id);
        jsonData.setCode(i);
        return jsonData;
    }

    //通过收货地址id修改数据
    @RequestMapping("/updaddress")
    private Object updaddress(ShippingAddress shippingAddress){
        jsonData = new JsonData();

        int i = shippingAddressService.updateByPrimaryKeySelective(shippingAddress);
        jsonData.setCode(i);
        return jsonData;
    }



    @RequestMapping("/updateOrder")//修改订单
    private Object updateOrder(CommodityOrder commodityOrder) {
        Log log=new Log();

        int i = commodityOrderService.updateByPrimaryKeySelective(commodityOrder);
        jsonData.setCode(i);
        return jsonData;
    }

}
