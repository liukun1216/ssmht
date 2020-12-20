package com.zking.ssm.service.impl;

import com.zking.ssm.model.Log;
import com.zking.ssm.service.ILogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})


public class LogServiceImplTest {
    @Autowired
    private ILogService logService;
    @Test
    public void insert() {
        Log log=new Log();
        log.setType("管理员操作");
        log.setOperatorId(2);
        log.setOperating("测试测试");
        log.setModule("冻结用户");
        log.setResult("成功");
//        Date d=new Date();
//        Timestamp timestamp=new Timestamp(d.getTime());
//        log.setTime(timestamp);
        logService.insert(log);
    }

    @Test
    public void selectAll() {
        Log log=new Log();
        log.setType("管理员操作");
        log.setOperatorId(2);
        log.setOperating("测试测试");
        log.setModule("冻结用户");
        log.setResult("成功");
        List<Log> logs = logService.selectAll(log);
        for(Log l:logs){
            if(l.getTime()!=null){
                String s = l.getTime().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
                try {
                    Date date = sdf.parse(s);
                    System.out.println(date);
                }catch (Exception e){
                    e.printStackTrace();
                }
//                l.setTime(l.getTime().toString());
            }
        }
    }
}