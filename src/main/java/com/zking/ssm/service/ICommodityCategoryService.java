package com.zking.ssm.service;

import com.zking.ssm.model.CommodityCategory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface ICommodityCategoryService {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityCategory record);

    int insertSelective(CommodityCategory record);

    CommodityCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityCategory record);

    int updateByPrimaryKey(CommodityCategory record);

    Map listMap(CommodityCategory commodityCategory);

    List<Map> listListMap(CommodityCategory commodityCategory);
}