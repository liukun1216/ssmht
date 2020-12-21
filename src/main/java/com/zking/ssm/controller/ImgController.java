package com.zking.ssm.controller;

import com.zking.ssm.service.IAdministratorService;
import com.zking.ssm.service.IImageService;
import com.zking.ssm.service.impl.AdministratorServiceImpl;
import com.zking.ssm.service.impl.ImageServiceImpl;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImgController {

    @Autowired
    private IImageService imageService=new ImageServiceImpl();
    JsonData jsonData=new JsonData();

    @RequestMapping("/upload")
    private Object imgUp(MultipartFile file){
        return jsonData;
    }

}
