package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.ImageMapper;
import com.zking.ssm.model.Image;
import com.zking.ssm.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImageServiceImpl implements IImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Override
    public int insert(Image record) {
        return imageMapper.insert(record);
    }

    @Override
    public Image selectByPrimaryKey(Integer id) {
        return imageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Image record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Image record) {
        return 0;
    }
}
