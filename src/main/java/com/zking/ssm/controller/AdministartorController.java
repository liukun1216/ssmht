package com.zking.ssm.controller;

import com.zking.ssm.model.Administrator;
import com.zking.ssm.model.Log;
import com.zking.ssm.model.Shop;
import com.zking.ssm.service.IAdministratorService;
import com.zking.ssm.service.ILogService;
import com.zking.ssm.service.IShopService;
import com.zking.ssm.service.impl.AdministratorServiceImpl;
import com.zking.ssm.service.impl.LogServiceImpl;
import com.zking.ssm.service.impl.ShopServiceImpl;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdministartorController {
    @Autowired
    private IAdministratorService administratorService=new AdministratorServiceImpl();
    JsonData jsonData=new JsonData();


    @Autowired
    private ILogService logService=new LogServiceImpl();

    @Autowired
    private IShopService shopService=new ShopServiceImpl();

    @RequestMapping("/login")//管理员登录
    private Object login(Administrator administrator){
        Administrator a = administratorService.Login(administrator);
        if (null == a ) {

                jsonData.setMessage("帐号或密码错误");
                jsonData.setCode(-1);
        } else {
            Log log=new Log();
            log.setType("管理员");
            log.setModule("登录");
            log.setOperatorId(a.getId());
            log.setOperating("登录");
            log.setResult("成功");
            logService.insert(log);
            jsonData.setCode(0);
            jsonData.setMessage("登陆成功");
        }
        return jsonData;
    }
    @RequestMapping("/getLog")//查询日志
    private Object getLog(Log l){
        List<Log> logs = logService.selectAll(l);
        jsonData.setResult(logs);
        jsonData.setCode(0);
        jsonData.setMessage("查询成功");
        return jsonData;
    }
    @RequestMapping("/getShop")//查询店铺
    private Object getShop(Shop shop){
        List<Shop> shops = shopService.selectShop(shop);
        jsonData.setResult(shops);
        jsonData.setCode(0);
        jsonData.setMessage("查询成功");
        return jsonData;
    }


}
