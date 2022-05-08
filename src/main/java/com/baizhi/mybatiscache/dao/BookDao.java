package com.baizhi.mybatiscache.dao;

import com.baizhi.mybatiscache.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll();
    Book findBookById(String id);
}
