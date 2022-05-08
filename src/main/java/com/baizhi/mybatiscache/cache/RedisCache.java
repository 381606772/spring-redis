package com.baizhi.mybatiscache.cache;

import com.baizhi.mybatiscache.util.ApplicationContextUtils;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class RedisCache implements Cache {
    private final String id;

    public RedisCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void putObject(Object key, Object value) {
        RedisTemplate<Object, Object> redisTemplate = (RedisTemplate)ApplicationContextUtils.getBean("redisTemplate");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.opsForHash().put(id, key.toString(), value);
    }

    @Override
    public Object getObject(Object key) {
        RedisTemplate<Object, Object> redisTemplate = (RedisTemplate)ApplicationContextUtils.getBean("redisTemplate");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        Object object = redisTemplate.opsForHash().get(id, key.toString());
        return object;
    }

    @Override
    public Object removeObject(Object o) {
        System.out.println("=============remove=============");
        return null;
    }

    @Override
    public void clear() {
        RedisTemplate<Object, Object> redisTemplate = (RedisTemplate)ApplicationContextUtils.getBean("redisTemplate");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.delete(id);
    }

    @Override
    public int getSize() {
        return 0;
    }
}
