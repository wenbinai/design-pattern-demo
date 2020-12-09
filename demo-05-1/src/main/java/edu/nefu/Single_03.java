package edu.nefu;

/**
 * 饿汉模式(线程安全)
 */
public class Single_03 {
    public static Single_03 instance = new Single_03();

    private Single_03() {
        System.out.println("创建单例");
    }

    public static Single_03 getInstance() {
        return instance;
    }
}
