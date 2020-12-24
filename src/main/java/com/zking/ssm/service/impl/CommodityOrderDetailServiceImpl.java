package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.CommodityOrderDetailMapper;
import com.zking.ssm.model.CommodityOrderDetail;
import com.zking.ssm.service.ICommodityOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommodityOrderDetailServiceImpl implements ICommodityOrderDetailService {
    @Autowired
    private CommodityOrderDetailMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CommodityOrderDetail record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(CommodityOrderDetail record) {
        return mapper.insertSelective(record);
    }

    @Override
    public CommodityOrderDetail selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityOrderDetail record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CommodityOrderDetail record) {
        return mapper.updateByPrimaryKey(record);
    }
}
