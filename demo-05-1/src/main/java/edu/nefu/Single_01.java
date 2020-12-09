package edu.nefu;

/**
 * 懒汉模式(线程不安全)
 */
public class Single_01 {
    private static Single_01 instance;

    private Single_01() {
        System.out.println("创建单例");
    }

    public static Single_01 getInstance() {
        if (instance == null) {
            instance = new Single_01();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Task()).start();
        }
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        Single_01 instance = Single_01.getInstance();
    }
}
