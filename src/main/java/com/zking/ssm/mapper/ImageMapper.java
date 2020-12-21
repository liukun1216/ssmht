package com.zking.ssm.mapper;

import com.zking.ssm.model.Image;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {

    int insert(Image record);


    Image selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}