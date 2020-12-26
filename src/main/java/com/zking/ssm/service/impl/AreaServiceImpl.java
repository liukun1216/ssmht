package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.AreaMapper;
import com.zking.ssm.model.Area;
import com.zking.ssm.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AreaServiceImpl implements IAreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Area record) {
        return 0;
    }

    @Override
    public int insertSelective(Area record) {
        return 0;
    }

    @Override
    public Area selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Area record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Area record) {
        return 0;
    }

    @Override
    public Area listbyzipcode(Area area) {
        return areaMapper.listbyzipcode(area);
    }
}
