package edu.nefu.impl;

import edu.nefu.AbstractPhone;
import edu.nefu.materiel.Camera;
import edu.nefu.materiel.GPS;
import edu.nefu.materiel.Matetiel;
import edu.nefu.materiel.NFC;

import java.util.Map;

/**
 * 旗舰机
 */
public class GoodPhone extends AbstractPhone {

    @Override
    public AbstractPhone addMateriel(Map<String, Matetiel> materielMap) {
        return this;
    }

    @Override
    public String desc() {
        String detailDesc = "这是旗舰手机" + this.exMap.toString();
        return detailDesc;
    }
}
