package edu.nefu;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 利用CAS实现加锁, 从而实现线程安全
 */
public class Single_06 {
    private static AtomicReference<Single_06> INSTANCE = new AtomicReference<>();
    private static Single_06 instance;

    private Single_06() {
        System.out.println("创建单例");
    }

    public static Single_06 getInstance() {
        for (; ; ) {
            if (instance != null) return instance;
            INSTANCE.compareAndSet(null, new Single_06());
            return INSTANCE.get();
        }
    }

}
