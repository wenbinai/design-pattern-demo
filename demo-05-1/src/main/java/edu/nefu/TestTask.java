package edu.nefu;

public class TestTask implements Runnable {
    @Override
    public void run() {
        Single_03 instance = Single_03.getInstance();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(new TestTask()).start();
        }
    }
}
