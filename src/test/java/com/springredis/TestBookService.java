package com.springredis;

import com.baizhi.BaizhiApplication;
import com.baizhi.mybatiscache.entity.Book;
import com.baizhi.mybatiscache.service.IBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = BaizhiApplication.class)
@RunWith(SpringRunner.class)
public class TestBookService {

    @Autowired
    private IBookService bookService;

    @Test
    public void testFindAll() {
        List<Book> books = bookService.findAll();
        books.forEach(System.out::println);

        System.out.println("==============================");

        List<Book> bookList = bookService.findAll();
        bookList.forEach(System.out::println);
    }
}
