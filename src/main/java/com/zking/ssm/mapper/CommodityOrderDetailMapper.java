package com.zking.ssm.mapper;

import com.zking.ssm.model.CommodityOrderDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityOrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityOrderDetail record);

    int insertSelective(CommodityOrderDetail record);

    CommodityOrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityOrderDetail record);

    int updateByPrimaryKey(CommodityOrderDetail record);
}