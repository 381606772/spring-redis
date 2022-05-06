package com.baizhi.dao;

import com.baizhi.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll();
    Book findBookById(String id);
}
