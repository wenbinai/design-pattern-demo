package edu.nefu.usb.impl;

import edu.nefu.usb.TypeC;

public class TypeCImpl implements TypeC {
    @Override
    public void typeCRead() {
        System.out.println("这是按照Typc标准读取数据");
    }

    @Override
    public void quickCharge() {
        System.out.println("这是Typec 独有的快充方式");
    }
}
