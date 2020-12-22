package com.zking.ssm.mapper;

import com.zking.ssm.model.CommodityOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityOrderMapper {

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