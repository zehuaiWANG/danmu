package com.danmu.dao;

import com.danmu.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(String eamil);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String eamil);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkEmail(String email);

    User selectLogin(@Param("email") String email, @Param("password") String password);
}