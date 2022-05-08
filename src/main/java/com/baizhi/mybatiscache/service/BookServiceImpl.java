package com.baizhi.mybatiscache.service;

import com.baizhi.mybatiscache.dao.BookDao;
import com.baizhi.mybatiscache.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findBookById(String id) {
        return bookDao.findBookById(id);
    }
}
