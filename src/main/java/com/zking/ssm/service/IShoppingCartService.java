package com.zking.ssm.service;

import com.zking.ssm.model.ShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IShoppingCartService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
    List<ShoppingCart> getcar(ShoppingCart record);

    ShoppingCart get(ShoppingCart record);
}