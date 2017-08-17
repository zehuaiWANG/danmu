package com.danmu.service.impl;

import com.danmu.common.ServerResponse;
import com.danmu.dao.UserMapper;
import com.danmu.pojo.User;
import com.danmu.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User>login(String email,String password){
        int count = userMapper.checkEmail(email);
        if (count == 0){
            return  ServerResponse.createByErrorMessage("用户名不存在");
        }
        User user = userMapper.selectLogin(email,password);
        if (user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }
}
