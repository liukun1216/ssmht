package com.zking.ssm.service;

import com.zking.ssm.model.User;
import org.springframework.stereotype.Repository;

public interface IUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //账号登录
    User listByAccountAndPassword(User user);

    //手机号登录
    User listByPhoneAndPassword(User user);
}