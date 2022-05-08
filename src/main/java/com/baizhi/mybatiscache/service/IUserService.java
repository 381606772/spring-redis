package com.baizhi.mybatiscache.service;

import com.baizhi.mybatiscache.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(String id);

    void deleteById(String id);
}
