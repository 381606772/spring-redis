package com.springredis;

import com.springredis.chapter01.RedisApplication;
import com.springredis.chapter01.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest(classes = RedisApplication.class)
@RunWith(SpringRunner.class)
public class TestRedisTemplate {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void test01() {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setName("fujian");

        redisTemplate.opsForValue().set("user", user);
    }

    @Test
    public void test02() {
        Object user = redisTemplate.opsForValue().get("user");
        System.out.println("user = " + user);

        RedisSerializer<?> keySerializer = redisTemplate.getKeySerializer();
        System.out.println("keySerializer = " + keySerializer);
    }

    @Test
    public void test03() {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setName("fujian");

        // 设置key的序列化为StringRedisSerializer
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set("user2", user);

        // list
        redisTemplate.opsForList().leftPush("userList", user);
        // set
        redisTemplate.opsForSet().add("userSet", user);
        // zset
        redisTemplate.opsForZSet().add("userZSet", user, 100);

        // hash
        // 首先将hash的key的序列化也设置成StringRedisSerializer.
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.opsForHash().put("userMap", "name", user);


    }
}
