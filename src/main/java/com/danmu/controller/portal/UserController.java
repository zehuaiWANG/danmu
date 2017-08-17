package com.danmu.controller.portal;

import com.danmu.common.Const;
import com.danmu.common.ServerResponse;
import com.danmu.pojo.User;
import com.danmu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;
    /*
    * 用户登录
    * */

    @RequestMapping(value ="login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String email, String password, HttpSession session){
        ServerResponse<User> response = iUserService.login(email,password);
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }
}
