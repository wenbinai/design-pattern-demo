package edu.nefu.impl;

import edu.nefu.AbstractPhone;
import edu.nefu.materiel.Camera;
import edu.nefu.materiel.Matetiel;

import java.util.Map;

/**
 * 拍照手机
 */
public class PhotoPhone extends AbstractPhone {


    @Override
    public AbstractPhone addMateriel(Map<String, Matetiel> materielMap) {
        return this;
    }

    @Override
    public String desc() {
        String detailDesc = "这是拍照手机" + this.exMap.toString();
        return detailDesc;
    }

}
