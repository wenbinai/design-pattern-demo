package edu.nefu;

import edu.nefu.materiel.*;


/**
 * 手机模板类
 */
public abstract class AbstractPhone {
    /**
     * 基本组件
     */
    private CPU cpu;
    private Memory memory;
    private Battery battery;
    private Screen screen;

    // 手机详细描述
    public abstract String desc();

    // 增加额外组件
    public abstract AbstractPhone addMatetiel(String matetielDesc, Matetiel matetiel);
}
