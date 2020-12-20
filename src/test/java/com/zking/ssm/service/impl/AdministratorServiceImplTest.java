package com.zking.ssm.service.impl;

import com.zking.ssm.model.Administrator;
import com.zking.ssm.service.IAdministratorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})



public class AdministratorServiceImplTest {

    @Autowired
    private IAdministratorService administratorService;
    @Test
    public void insert() {
        Administrator a=new Administrator();
        a.setName("州议员");
        a.setPassword("123");
        a.setPhone("123321");
        int insert = administratorService.insert(a);
        System.out.println(insert);
    }
    @Test
    public void selectByid(){
        Administrator a=new Administrator();

//        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
//        Date d=new Date();
//        String format = formatter.format(d);
//        System.out.println(format);
        a.setName("也有张");
        a.setPassword("1223");
        administratorService.Login(a);
    }

}