package com.zking.ssm.mapper;

import com.zking.ssm.model.Log;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

    List<Log> selectAll(Log record);
}