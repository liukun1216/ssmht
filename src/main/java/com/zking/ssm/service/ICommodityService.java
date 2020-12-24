package com.zking.ssm.service;

import com.zking.ssm.model.Commodity;

import java.util.List;
import java.util.Map;


public interface ICommodityService {
    int deleteByPrimaryKey(Integer id);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKeyWithBLOBs(Commodity record);

    int updateByPrimaryKey(Commodity record);

    List<Map> listListMap(Commodity commodity);

    public List<Commodity> listLike(Commodity commodity);

    List<Commodity> listByShopId(Commodity commodity);

    Commodity get (Commodity commodity);
}