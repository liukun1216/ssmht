package com.zking.ssm.controller;

import com.zking.ssm.model.Area;
import com.zking.ssm.service.IAreaService;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class areaController {
    @Autowired
    private IAreaService areaService;
    public JsonData  jsonData= new JsonData();

    @RequestMapping("/listbyzipcode")
    public Object listbyzipcode(Area area){

        Area area1 = areaService.listbyzipcode(area);
        System.out.println(area1);
        jsonData.setResult(area1);
        jsonData.setCode(0);
        return  jsonData;
    }
}
