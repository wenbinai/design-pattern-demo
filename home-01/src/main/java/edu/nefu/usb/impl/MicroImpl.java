package edu.nefu.usb.impl;

import edu.nefu.usb.Micro;

public class MicroImpl implements Micro {
    @Override
    public void microRead() {
        System.out.println("按照Micro标准读取数据");
    }

    @Override
    public void SlowCharge() {
        System.out.println("这是普通充电方式");
    }
}
