package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.CommodityMapper;
import com.zking.ssm.model.Commodity;
import com.zking.ssm.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CommodityServiceImpl implements ICommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return commodityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Commodity record) {
        return commodityMapper.insert(record);
    }

    @Override
    public int insertSelective(Commodity record) {
        return commodityMapper.insertSelective(record);
    }

    @Override
    public Commodity selectByPrimaryKey(Integer id) {
        return commodityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Commodity record) {
        return commodityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Commodity record) {
        return commodityMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Commodity record) {
        return commodityMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Map> listListMap(Commodity commodity) {
        return commodityMapper.listListMap(commodity);
    }

    @Override
    public List<Commodity> listLike(Commodity commodity) {
        return commodityMapper.listLike(commodity);
    }
}
