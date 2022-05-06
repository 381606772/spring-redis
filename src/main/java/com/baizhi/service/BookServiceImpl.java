package com.baizhi.service;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
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
