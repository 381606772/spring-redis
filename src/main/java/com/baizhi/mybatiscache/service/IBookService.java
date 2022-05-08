package com.baizhi.mybatiscache.service;

import com.baizhi.mybatiscache.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    Book findBookById(String id);
}
