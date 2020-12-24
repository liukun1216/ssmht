package com.zking.ssm.controller;

import com.zking.ssm.model.CommodityOrder;
import com.zking.ssm.service.ICommodityOrderService;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comorder")
public class CommodityOrderController {
    @Autowired
    private ICommodityOrderService commodityOrderService;
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





}