package edu.nefu;

import edu.nefu.factory.MatetielFactory;
import org.junit.Test;

public class MatetielFactoryTest {
    @Test
    public void test_matetielFactory() {
        MatetielFactory matetielFactory = MatetielFactory.getMatetielFactory();
        matetielFactory.buildCamera();
        matetielFactory.buildGPS();
        matetielFactory.buildNFC();
    }
}
