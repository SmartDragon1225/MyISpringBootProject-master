package com.sawyer.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sawyer.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO  extends BaseMapper<User> {


}
