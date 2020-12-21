package com.zking.ssm.service;

import com.zking.ssm.model.Image;
import org.springframework.stereotype.Repository;

public interface IImageService {

    int insert(Image record);


    Image selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}