package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.CommodityCategoryMapper;
import com.zking.ssm.model.CommodityCategory;
import com.zking.ssm.service.ICommodityCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CommodityCategoryServiceImpl implements ICommodityCategoryService {
    @Autowired
    private CommodityCategoryMapper commodityCategoryMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return commodityCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CommodityCategory record) {
        return commodityCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(CommodityCategory record) {
        return commodityCategoryMapper.insertSelective(record);
    }

    @Override
    public CommodityCategory selectByPrimaryKey(Integer id) {
        return commodityCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityCategory record) {
        return commodityCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CommodityCategory record) {
        return commodityCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public Map listMap(CommodityCategory commodityCategory) {
        return commodityCategoryMapper.listMap(commodityCategory);
    }

    @Override
    public List<Map> listListMap(CommodityCategory commodityCategory) {
        return commodityCategoryMapper.listListMap(commodityCategory);
    }


}
