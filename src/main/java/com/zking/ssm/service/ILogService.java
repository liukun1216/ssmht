package com.zking.ssm.service;

import com.zking.ssm.model.Log;

import java.util.List;

public interface ILogService {
    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

    List<Log> selectAll(Log record);
}