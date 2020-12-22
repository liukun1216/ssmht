package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.ShoppingCartMapper;
import com.zking.ssm.model.ShoppingCart;
import com.zking.ssm.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ShoppingCartServiceImpl implements IShoppingCartService {
    @Autowired
    private ShoppingCartMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShoppingCart record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return mapper.insertSelective(record);
    }

    @Override
    public ShoppingCart selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCart record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShoppingCart record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ShoppingCart> getcar(ShoppingCart record) {
        return mapper.getcar(record);
    }

    @Override
    public ShoppingCart get(ShoppingCart record) {
        return mapper.get(record);
    }
}
