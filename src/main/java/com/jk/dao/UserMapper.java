package com.jk.dao;

import com.jk.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> selectAll();
}
