package com.zking.ssm.controller;

import com.zking.ssm.model.User;
import com.zking.ssm.service.IUserService;
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
    public User  login (User user){
        User user1 = userService.selectByPrimaryKey(user.getId());

        return user1;
    }

}
