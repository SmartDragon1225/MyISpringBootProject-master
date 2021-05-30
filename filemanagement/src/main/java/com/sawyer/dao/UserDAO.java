package com.sawyer.dao;

import com.sawyer.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    User  login(User user);
}
