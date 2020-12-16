package edu.nefu.factory;

import edu.nefu.AbstractPhone;

public class PhoneBuild {
    public AbstractPhone buildOldPhone() {
        PhoneCategory oldPhone = new PhoneCategory("老年机");
        return oldPhone;
    }

    public AbstractPhone buildPhotoPhone() {
        PhoneCategory photoPhone = new PhoneCategory("拍照手机");
        photoPhone.addMatetiel("camera", MatetielFactory.getMatetielFactory().buildCamera());
        return photoPhone;
    }

    public AbstractPhone buildGoodPhone() {
        PhoneCategory goodPhone = new PhoneCategory("旗舰手机");
        goodPhone.addMatetiel("camera", MatetielFactory.getMatetielFactory().buildCamera())
                .addMatetiel("GPS", MatetielFactory.getMatetielFactory().buildGPS())
                .addMatetiel("NFC", MatetielFactory.getMatetielFactory().buildNFC());

        return goodPhone;
    }
}
