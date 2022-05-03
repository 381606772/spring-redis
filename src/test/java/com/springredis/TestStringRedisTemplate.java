package com.springredis;

import com.springredis.chapter01.RedisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest(classes = RedisApplication.class)
@RunWith(SpringRunner.class)
public class TestStringRedisTemplate {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test01() {
        stringRedisTemplate.opsForValue().set("name", "付建", 120, TimeUnit.SECONDS);
    }

    @Test
    public void testKey() {
        Boolean hasKey = stringRedisTemplate.hasKey("name");
        System.out.println("hasKey = " + hasKey);

        DataType type = stringRedisTemplate.type("name");
        System.out.println("type = " + type);

        Set<String> keys = stringRedisTemplate.keys("*");
        keys.forEach(System.out::println);

        stringRedisTemplate.renameIfAbsent("name", "newname");
    }
}
