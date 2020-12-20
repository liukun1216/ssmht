package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.ShopMapper;
import com.zking.ssm.model.Shop;
import com.zking.ssm.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShopServiceImpl implements IShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return shopMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Shop record) {
        return shopMapper.insert(record);
    }

    @Override
    public int insertSelective(Shop record) {
        return shopMapper.insertSelective(record);
    }

    @Override
    public Shop selectByPrimaryKey(Integer id) {
        return shopMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Shop record) {
        return shopMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Shop record) {
        return shopMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Shop> selectShop(Shop record) {
        return shopMapper.selectShop(record);
    }
}
