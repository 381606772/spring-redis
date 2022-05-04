package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findById(String id);

    void deleteById(String id);
}
