package edu.nefu.imple;

import edu.nefu.CacheService;
import edu.nefu.RedisUtils;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {
    // 1. 注入Redis工具
    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);

    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
