package com.zking.ssm.mapper;

import com.zking.ssm.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);


    List<ShoppingCart> getcar(ShoppingCart record);

    ShoppingCart get(ShoppingCart record);
}