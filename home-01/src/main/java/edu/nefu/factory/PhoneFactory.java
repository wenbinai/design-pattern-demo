package edu.nefu.factory;

import edu.nefu.AbstractPhone;
import edu.nefu.impl.GoodPhone;
import edu.nefu.impl.OldPhone;
import edu.nefu.impl.PhotoPhone;
import edu.nefu.materiel.Camera;
import edu.nefu.materiel.GPS;
import edu.nefu.materiel.Matetiel;

import java.util.HashMap;
import java.util.Map;

public class PhoneFactory {
    public static Map<String, Matetiel> map = new HashMap<>();

    public static AbstractPhone oldPhone() {
        return new OldPhone();
    }

    public static AbstractPhone photoPhone() {
        map.put("camera", new Camera());
        return new PhotoPhone()
                .addMateriel(map);
    }

    public static AbstractPhone goodPhone() {
        map.put("camera", new Camera());
        map.put("GPS", new GPS());
        return new GoodPhone()
                .addMateriel(map);
    }


}
