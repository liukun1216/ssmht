package com.zking.ssm.mapper;

import com.zking.ssm.model.CommodityCategory;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommodityCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityCategory record);

    int insertSelective(CommodityCategory record);

    CommodityCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityCategory record);

    int updateByPrimaryKey(CommodityCategory record);

    Map  listMap(CommodityCategory commodityCategory);

    List<Map> listListMap(CommodityCategory commodityCategory);
}