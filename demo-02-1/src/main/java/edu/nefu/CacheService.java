package edu.nefu;

import java.util.concurrent.TimeUnit;

/**
 * 面向接口编程, 利用接口的多态性,实现功能的良好扩展
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
