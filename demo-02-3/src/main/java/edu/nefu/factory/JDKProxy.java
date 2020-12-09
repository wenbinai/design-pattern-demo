package edu.nefu.factory;

import java.lang.reflect.Proxy;

public class JDKProxy {
    public static <T> T getProxy(Class interfaceClass, ICacheAdapter cacheAdapter) {
        JDKInvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
