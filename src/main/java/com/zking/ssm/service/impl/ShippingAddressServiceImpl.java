package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.ShippingAddressMapper;
import com.zking.ssm.model.ShippingAddress;
import com.zking.ssm.service.IShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShippingAddressServiceImpl implements IShippingAddressService {
    @Autowired
    private ShippingAddressMapper shippingAddressMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return shippingAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShippingAddress record) {
        return shippingAddressMapper.insert(record);
    }

    @Override
    public int insertSelective(ShippingAddress record) {
        return 0;
    }

    @Override
    public ShippingAddress selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ShippingAddress record) {
        return shippingAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShippingAddress record) {
        return 0;
    }

    @Override
    public List<ShippingAddress> listByuserid(ShippingAddress shippingAddress) {
        return shippingAddressMapper.listByuserid(shippingAddress);
    }
}
