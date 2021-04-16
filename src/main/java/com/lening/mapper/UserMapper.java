package com.lening.mapper;

import com.lening.entity.UserBean;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UserBean> {
    List<UserBean> getUserList();

}
