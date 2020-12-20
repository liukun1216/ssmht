package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.AdministratorMapper;
import com.zking.ssm.model.Administrator;
import com.zking.ssm.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdministratorServiceImpl implements IAdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return administratorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Administrator record) {
        return administratorMapper.insert(record);
    }



    @Override
    public Administrator selectByPrimaryKey(Integer id) {
        return administratorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Administrator record) {
        return administratorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Administrator> selectAll() {
        return administratorMapper.selectAll();
    }

    @Override
    public Administrator Login(Administrator record) {
        return administratorMapper.Login(record);
    }


}
