package com.jk.serviceImpl;

import com.jk.dao.UserMapper;
import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserMapper userDao;


    @Override
    public List<UserEntity> selectAll() {
        return userDao.selectAll();
    }
}
