package com.zking.ssm.service;

import com.zking.ssm.model.Administrator;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IAdministratorService {
    int deleteByPrimaryKey(Integer id);

    int insert(Administrator record);


    Administrator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Administrator record);

    List<Administrator> selectAll();
    Administrator Login(Administrator record);
}