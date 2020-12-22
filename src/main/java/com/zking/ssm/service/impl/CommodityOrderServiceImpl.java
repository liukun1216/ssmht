package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.CommodityOrderMapper;
import com.zking.ssm.model.CommodityOrder;
import com.zking.ssm.service.ICommodityOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommodityOrderServiceImpl implements ICommodityOrderService {
    @Autowired
    private CommodityOrderMapper commodityOrderMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return commodityOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CommodityOrder record) {
        return commodityOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(CommodityOrder record) {
        return commodityOrderMapper.insertSelective(record);
    }

    @Override
    public CommodityOrder selectByPrimaryKey(Integer id) {
        return commodityOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityOrder record) {
        return commodityOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CommodityOrder record) {
        return updateByPrimaryKey(record);
    }

    @Override
    public List listbyid(long id) {
        return commodityOrderMapper.listbyid(id);
    }

    @Override
    public List listbydouduiyi(CommodityOrder commodityOrder) {
        return commodityOrderMapper.listbydouduiyi(commodityOrder);
    }

    @Override
    public List listsy( ) {
        return commodityOrderMapper.listsy();
    }
}