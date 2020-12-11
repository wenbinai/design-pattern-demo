package edu.nefu.observe.impl;

import edu.nefu.observe.Observer;

public class Superviser implements Observer {
    @Override
    public void react(String desc) {
        System.out.println("接收到: " + desc + " 信息");
        System.out.println("我是质量监督者, 即将上报事件");
    }
}
