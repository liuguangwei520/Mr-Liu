package com.chenwenxing.demo.tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisTool {
    @Autowired
    RedisTemplate redisTemplate;

    public void setValue(String key,Object object){
        redisTemplate.opsForValue().set(key,object);
    }

    public Object getValue(String key){
        Object object = redisTemplate.opsForValue().get(key);
        return object;
    }
}
