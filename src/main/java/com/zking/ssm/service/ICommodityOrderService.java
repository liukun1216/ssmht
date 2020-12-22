package com.zking.ssm.service;

import com.zking.ssm.model.CommodityOrder;

import java.util.List;

public interface ICommodityOrderService {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityOrder record);

    int insertSelective(CommodityOrder record);

    CommodityOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityOrder record);

    int updateByPrimaryKey(CommodityOrder record);
    List listbyid(long id);
    List listbydouduiyi(CommodityOrder commodityOrder);
    List  listsy();
}