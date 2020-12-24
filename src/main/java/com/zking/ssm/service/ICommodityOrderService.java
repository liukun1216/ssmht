package com.zking.ssm.service;

import com.zking.ssm.model.CommodityOrder;

import java.util.List;

public interface ICommodityOrderService {
    int deleteByPrimaryKey(String id);

    int insert(CommodityOrder record);

    int insertSelective(CommodityOrder record);

    CommodityOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommodityOrder record);

    int updateByPrimaryKey(CommodityOrder record);
    List listbyid(String id);
    List listbydouduiyi(CommodityOrder commodityOrder);
    List  listsy();
}