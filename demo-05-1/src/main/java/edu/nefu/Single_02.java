package edu.nefu;

/**
 * 线程安全版的单例模式
 */
public class Single_02 {
    private static Single_02 instance;

    private Single_02() {
        System.out.println("创建单例");
    }

    public synchronized static Single_02 getInstance() {
        if (instance == null) {
            instance = new Single_02();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new MyTask()).start();
        }
    }
}

class MyTask implements Runnable {
    @Override
    public void run() {
        Single_02 instance = Single_02.getInstance();
    }
}

