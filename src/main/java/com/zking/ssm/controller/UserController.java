package com.zking.ssm.controller;

import com.zking.ssm.model.User;
import com.zking.ssm.service.IUserService;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private  IUserService userService;

//    @GetMapping("/login")
    @RequestMapping("/login")
    public Object  login (User user){
        JsonData jsonData = new JsonData();
        User u = userService.listByAccountAndPassword(user);

        if (null == u || !u.getPassword().equals(user.getPassword())) {
            jsonData.setCode(-1);
            jsonData.setMessage("帐号或密码错误");
        } else {
            jsonData.setCode(0);
            jsonData.setMessage("登陆成功");
        }
        return jsonData;
    }

}
