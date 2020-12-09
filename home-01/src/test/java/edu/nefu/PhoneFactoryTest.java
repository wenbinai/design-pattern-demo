package edu.nefu;

import edu.nefu.factory.PhoneFactory;
import edu.nefu.impl.PhotoPhone;
import org.junit.Test;

public class PhoneFactoryTest {
    @Test
    public void test_build() {
        AbstractPhone abstractPhone = new PhoneFactory().oldPhone();
        System.out.println(abstractPhone.desc());
        abstractPhone = new PhoneFactory().photoPhone();
        System.out.println(abstractPhone.desc());
        abstractPhone = new PhoneFactory().goodPhone();
        System.out.println(abstractPhone.desc());


    }
}
