package edu.nefu.factory;

import edu.nefu.AbstractPhone;
import edu.nefu.materiel.Matetiel;

import java.util.HashMap;
import java.util.Map;

/**
 * 手机分类
 */
public class PhoneCategory extends AbstractPhone {
    private Map<String, Matetiel> map = new HashMap<>();

    private PhoneCategory() {

    }

    private String phoneCategory;

    public PhoneCategory(String phoneCategory) {
        this.phoneCategory = phoneCategory;
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

    @Override
    public AbstractPhone addMatetiel(String matetielDesc, Matetiel matetiel) {
        map.put(matetielDesc, matetiel);
        return this;
    }
}
