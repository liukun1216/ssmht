package com.zking.ssm.controller;

import com.zking.ssm.model.*;
import com.zking.ssm.service.*;
import com.zking.ssm.service.impl.*;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdministartorController {
    @Autowired
    private IAdministratorService administratorService = new AdministratorServiceImpl();
    JsonData jsonData = new JsonData();


    @Autowired
    private ILogService logService = new LogServiceImpl();

    @Autowired
    private IShopService shopService = new ShopServiceImpl();

    @Autowired
    private IUserService userService = new UserServiceImpl();

    @Autowired
    private ICommodityService commodityService = new CommodityServiceImpl();

    @RequestMapping("/login")//管理员登录
    private Object login(Administrator administrator) {
        Administrator a = administratorService.Login(administrator);
        if (null == a) {

            jsonData.setMessage("帐号或密码错误");
            jsonData.setCode(-1);
        } else {
//            Log log=new Log();
//            log.setType("管理员");
//            log.setModule("登录");
//            log.setOperatorId(a.getId());
//            log.setOperating("登录");
//            log.setResult("成功");
//            logService.insert(log);
            jsonData.setResult(a);
            jsonData.setCode(0);
            jsonData.setMessage("登陆成功");
        }
        return jsonData;
    }

    @RequestMapping("/getLog")//查询日志
    private Object getLog(Log l) {
        List<Log> logs = logService.selectAll(l);
        jsonData.setResult(logs);
        jsonData.setCode(0);
        jsonData.setMessage("查询成功");
        return jsonData;
    }

    @RequestMapping("/getShop")//查询店铺
    private Object getShop(Shop shop) {
        List<Shop> shops = shopService.selectShop(shop);
        jsonData.setResult(shops);
        jsonData.setCode(0);
        jsonData.setMessage("查询成功");
        return jsonData;
    }

    @RequestMapping("/ShopDudit")//查询店铺
    private Object shopDudit(Shop shop) {
        int i = shopService.updateByPrimaryKeySelective(shop);
        jsonData.setCode(i);
        return jsonData;
    }

    @RequestMapping("/updateUser")//冻结用户
    private Object updateUser(User user, int adminId) {
        int i = userService.updateByPrimaryKeySelective(user);
        Log log = new Log();
        log.setType("管理员");
        String status = user.getStatus();
        if (status.equals("正常")) {
            log.setOperating("解冻用户");
        } else {
            log.setOperating("冻结用户");
        }
        log.setModule("操作用户");
        log.setOperatorId(adminId);
        log.setResult("成功");
        logService.insert(log);
        jsonData.setCode(i);
        return jsonData;
    }

    @RequestMapping("/updateShop")//修改店铺状态
    private Object updateShop(Shop shop, int adminId) {
        Log log = new Log();
        log.setType("管理员");
        int i = shopService.updateByPrimaryKeySelective(shop);
        String status = shop.getShopstatus();
        jsonData.setCode(i);
        if (status.equals("正常")) {
            log.setOperating("解冻店铺");
        } else {
            log.setOperating("冻结店铺");
        }
        log.setModule("操作店铺");
        log.setOperatorId(adminId);
        log.setResult("成功");
        logService.insert(log);
        return jsonData;
    }

    @RequestMapping("/updateCommodity")//下架商品
    private Object updateCommodity(Commodity commodity, int adminId) {
        int i = commodityService.updateByPrimaryKeySelective(commodity);
        Log log = new Log();
        log.setType("管理员");
        String status = commodity.getStatus();
        if (status.equals("正常")) {
            log.setOperating("上架商品");
        } else {
            log.setOperating("下架商品");
        }
        log.setModule("操作商品");
        log.setOperatorId(adminId);
        log.setResult("成功");
        logService.insert(log);
        jsonData.setCode(i);
        return jsonData;
    }

    @RequestMapping("/user")
    private Object getUser(User user) {

        List<User> users = userService.selectList(user);
        jsonData.setResult(users);

        jsonData.setCode(1);


        return jsonData;
    }


}
