package edu.nefu;

import edu.nefu.factory.PhoneFactoryRefactor;
import org.junit.Test;

public class PhoneFactoryTest {
//    @Test
//    public void test_build() {
//        AbstractPhone abstractPhone = new PhoneFactory().oldPhone();
//        System.out.println(abstractPhone.desc());
//        abstractPhone = new PhoneFactory().photoPhone();
//        System.out.println(abstractPhone.desc());
//        abstractPhone = new PhoneFactory().goodPhone();
//        System.out.println(abstractPhone.desc());
//
//
//    }

    @Test
    public void test_build_refactor() {
        System.out.println(new PhoneFactoryRefactor().buildGoodPhone().desc());
        System.out.println(new PhoneFactoryRefactor().buildOldPhone().desc());
        System.out.println(new PhoneFactoryRefactor().buildPhotoPhone().desc());
    }
}
