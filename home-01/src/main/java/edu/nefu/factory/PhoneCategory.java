package edu.nefu.factory;

import edu.nefu.AbstractPhone;
import edu.nefu.IMatetiel;
import edu.nefu.materiel.Camera;
import edu.nefu.materiel.GPS;
import edu.nefu.materiel.Matetiel;
import edu.nefu.materiel.NFC;

import java.util.HashMap;
import java.util.Map;

public class PhoneCategory extends AbstractPhone implements IMatetiel {
    public Map<String, Matetiel> map = new HashMap<>();

    private PhoneCategory() {

    }

    private String phoneCategory;

    public PhoneCategory(String phoneCategory) {
        this.phoneCategory = phoneCategory;
    }

    @Override
    public PhoneCategory addCamera(Matetiel matetiel) {
        map.put("camera", new Camera());
        return this;
    }

    @Override
    public PhoneCategory addNFC(Matetiel matetiel) {
        map.put("NFC", new NFC());
        return this;
    }

    @Override
    public PhoneCategory addGPS(Matetiel matetiel) {
        map.put("GPS", new GPS());
        return this;
    }


    @Override
    public String desc() {
        StringBuilder sb = new StringBuilder();
        sb.append("这是: ");
        sb.append(phoneCategory);
        sb.append(" 额外组件数: " + map.size());
        for (String key : map.keySet()) {
            sb.append(map.get(key));
        }
        return sb.toString();
    }
}
