package com.zking.ssm.controller;

import com.zking.ssm.model.Commodity;
import com.zking.ssm.service.ICommodityService;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CommodityController {
    @Autowired
    private ICommodityService commodityService;
    JsonData jsonData;

    @RequestMapping("/AddAndUp")
    public Object Add(Commodity commodity ){
        jsonData= new JsonData();
        if(commodity.getId()!=null){
            int i = commodityService.updateByPrimaryKey(commodity);
            jsonData.setMessage("修改成功");
            jsonData.setCode(i);

        }else{
            int i = commodityService.insert(commodity);
            jsonData.setMessage("增加成功");
            jsonData.setCode(i);
        }
        return jsonData;
    }
    @RequestMapping("/Del")
    public Object Del(Commodity commodity ){
        jsonData= new JsonData();

            int i = commodityService.deleteByPrimaryKey(commodity.getId());
            jsonData.setMessage("删除成功");
            jsonData.setCode(i);


        return jsonData;
    }

    @RequestMapping("/List")
    public Object List(Commodity commodity ){
        jsonData= new JsonData();

        List<Map> maps = commodityService.listListMap(commodity);
        jsonData.setMessage("查询成功");
        jsonData.setResult(maps);
        return jsonData;
    }
    @RequestMapping("/Listlike")
    public List<Commodity> Listlike(Commodity commodity ){
        jsonData= new JsonData();

        List<Commodity> commodities = commodityService.listLike(commodity);
        jsonData.setMessage("查询成功");

        return commodities;
    }


}
