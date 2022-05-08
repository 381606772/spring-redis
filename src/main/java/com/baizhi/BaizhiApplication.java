package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.mybatiscache.dao")
public class BaizhiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaizhiApplication.class, args);
    }
}
