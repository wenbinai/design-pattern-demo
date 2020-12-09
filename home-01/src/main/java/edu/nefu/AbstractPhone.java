package edu.nefu;

import edu.nefu.materiel.*;

import java.util.HashMap;
import java.util.Map;

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

    // 额外的组件
    protected Map<String, Matetiel> exMap = new HashMap<>();

    // 额外的部件(物料)
    public abstract AbstractPhone addMateriel(Map<String, Matetiel> materielMap);

    // 手机详细描述
    public abstract String desc();
}
