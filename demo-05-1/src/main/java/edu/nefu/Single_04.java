package edu.nefu;

/**
 * 使用类的内部类(线程安全)
 */
public class Single_04 {
    private static class SingleHolder {
        private static Single_04 instance = new Single_04();
    }

    private Single_04() {

    }

    public static Single_04 getInstance() {
        return SingleHolder.instance;
    }
}
