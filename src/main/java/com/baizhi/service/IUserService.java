package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(String id);

    void deleteById(String id);
}
