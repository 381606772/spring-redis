package com.baizhi.service;

import com.baizhi.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    Book findBookById(String id);
}
