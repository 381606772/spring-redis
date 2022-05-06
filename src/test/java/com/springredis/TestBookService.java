package com.springredis;

import com.baizhi.BaizhiApplication;
import com.baizhi.entity.Book;
import com.baizhi.entity.User;
import com.baizhi.service.IBookService;
import com.baizhi.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

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
