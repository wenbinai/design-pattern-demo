package edu.nefu.factory;

import edu.nefu.materiel.Camera;
import edu.nefu.materiel.GPS;
import edu.nefu.materiel.Matetiel;
import edu.nefu.materiel.NFC;

/**
 * 材料工厂, 利用单例模式, 生成唯一一个
 */
public class MatetielFactory {
    private static MatetielFactory matetielFactory;

    private MatetielFactory() {

    }

    public static MatetielFactory getMatetielFactory() {
        if (matetielFactory == null) {
            matetielFactory = new MatetielFactory();
        }
        return matetielFactory;
    }


    public Matetiel buildCamera() {
        return new Camera();
    }

    public Matetiel buildNFC() {
        return new NFC();
    }

    public Matetiel buildGPS() {
        return new GPS();
    }

}
