package com.baizhi.mybatiscache.service;

import com.baizhi.mybatiscache.dao.UserDao;
import com.baizhi.mybatiscache.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public void deleteById(String id) {
        userDao.deleteById(id);
    }
}
