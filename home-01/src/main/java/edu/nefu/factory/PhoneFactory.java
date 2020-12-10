package edu.nefu.factory;

import edu.nefu.AbstractPhone;
import edu.nefu.materiel.Camera;
import edu.nefu.materiel.GPS;
import edu.nefu.materiel.NFC;

public class PhoneFactory {
    public AbstractPhone buildOldPhone() {
        return new PhoneCategory("老年机");
    }

    public AbstractPhone buildPhotoPhone() {
        return new PhoneCategory("拍照手机")
                .addCamera(new Camera());
    }

    public AbstractPhone buildGoodPhone() {
        return new PhoneCategory("旗舰手机")
                .addNFC(new NFC())
                .addGPS(new GPS())
                .addCamera(new Camera());
    }
}
