package com.zking.ssm.service;

import com.zking.ssm.model.Area;
import org.springframework.stereotype.Repository;


public interface IAreaService {
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    Area listbyzipcode(Area area);
}