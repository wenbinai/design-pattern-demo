package edu.nefu.observe.impl;

import edu.nefu.observe.Observer;

public class Worker implements Observer {
    @Override
    public void react(String desc) {
        System.out.println("接收到: " + desc + " 信息");
        System.out.println("我是工人, 即将去维修");
    }
}
