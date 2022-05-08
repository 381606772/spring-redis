package com.baizhi.mybatiscache.dao;

import com.baizhi.mybatiscache.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findById(String id);

    void deleteById(String id);
}
