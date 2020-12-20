package com.zking.ssm.mapper;

import com.zking.ssm.model.Administrator;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Administrator record);


    Administrator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Administrator record);

    List<Administrator> selectAll();

    Administrator Login(Administrator record);
}