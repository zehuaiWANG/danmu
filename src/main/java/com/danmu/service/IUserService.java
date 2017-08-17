package com.danmu.service;

import com.danmu.common.ServerResponse;
import com.danmu.pojo.User;

public interface IUserService {
    ServerResponse<User> login(String eamil, String password);
}
