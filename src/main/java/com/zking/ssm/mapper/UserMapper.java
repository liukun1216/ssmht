package com.zking.ssm.mapper;

import com.zking.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
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

    //通过账号或手机号查询用户
    User listByAccountAndPhone(User user);

    List<User> selectList(User user);
}