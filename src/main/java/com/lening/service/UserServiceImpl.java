package com.lening.service;

import com.lening.entity.UserBean;
import com.lening.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;


    @Override
    public List<UserBean> getUserList() {
        return userMapper.selectAll();
    }
}
