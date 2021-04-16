package com.lening.controller;

import com.lening.entity.UserBean;
import com.lening.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    public UserService userService;

    @GetMapping("getUserList")
    @ResponseBody
    public List<UserBean> getUserList(){
        return userService.getUserList();
    }

}
