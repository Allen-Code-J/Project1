package com.example.project1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class PlanDao {
    public static final String HASH_KEY = "HashMapKey";
    @Autowired
    private RedisTemplate redisTemplate;

    public void deletePlan(String objectId) {
        redisTemplate.opsForHash().delete(HASH_KEY, objectId);
    }


}