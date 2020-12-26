package com.zking.ssm.service;

import com.zking.ssm.model.Shop;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IShopService {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    List<Shop> selectShop (Shop record);

    List<Shop> MHselect(Shop record);
}