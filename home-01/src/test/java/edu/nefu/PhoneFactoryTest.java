package edu.nefu;

import edu.nefu.factory.PhoneFactory;
import org.junit.Test;

public class PhoneFactoryTest {

    @Test
    public void test_build_refactor() {
        System.out.println(new PhoneFactory().buildGoodPhone().desc());
        System.out.println(new PhoneFactory().buildOldPhone().desc());
        System.out.println(new PhoneFactory().buildPhotoPhone().desc());
    }
}
