package com.zking.ssm.service.impl;

import com.zking.ssm.model.Area;
import com.zking.ssm.service.IAreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class AreaServiceImplTest {
    @Autowired
    private IAreaService areaService;

    @Test
    public void listbyzipcode() {
        Area  area = new Area();

        area.setZipCode("100010");

        Area listbyzipcode = areaService.listbyzipcode(area);
        System.out.println(listbyzipcode);

    }
}