package edu.nefu;

/**
 * 双重锁校验, 同时满足了懒加载
 * 是对方法级锁的优化
 */
public class Single_05 {
    private static Single_05 instance;

    private Single_05() {

    }

    public static Single_05 getInstance() {
        if (instance != null) return instance;
        synchronized (Single_05.class) {
            if (instance == null) {
                instance = new Single_05();
            }
        }
        return instance;
    }

}
