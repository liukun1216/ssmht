package com.zking.ssm.mapper;

import com.zking.ssm.model.ShippingAddress;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShippingAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShippingAddress record);

    int insertSelective(ShippingAddress record);

    ShippingAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);

    List<ShippingAddress> listByuserid(ShippingAddress shippingAddress);
}