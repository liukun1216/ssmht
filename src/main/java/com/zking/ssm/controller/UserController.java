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
    JsonData jsonData = new JsonData();
//    @GetMapping("/login")
    //
    @RequestMapping("/login")
    public Object  login (User user){

        User u1 = userService.listByAccountAndPassword(user);

        if (null == u1 || !u1.getPassword().equals(user.getPassword())) {
            User u2 = userService.listByPhoneAndPassword(user);
            if(null == u2 || !u2.getPassword().equals(user.getPassword())){
                jsonData.setMessage("帐号或密码错误");
                jsonData.setCode(-1);
            }else{
                jsonData.setCode(0);
                jsonData.setMessage("登陆成功");
            }
        } else {

            jsonData.setCode(0);
            jsonData.setMessage("登陆成功");
        }
        return jsonData;
    }
    //新增和修改
    @RequestMapping("/RsAndAd")
    public Object RegisterAndAmend(User user){
        if(user.getId()!=null){
            int i = userService.updateByPrimaryKey(user);
            jsonData.setMessage("修改成功");
            jsonData.setCode(i);

        }else{
            user.setStatus("正常");
            int i = userService.insert(user);
            jsonData.setMessage("注册成功");
            jsonData.setCode(i);
        }

        return jsonData;
    }

}
