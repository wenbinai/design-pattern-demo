package edu.nefu;

import edu.nefu.factory.PhoneBuild;
import org.junit.Test;

public class PhoneBuildTest {

    @Test
    public void test_build_refactor() {
        System.out.println(new PhoneBuild().buildGoodPhone().desc());
        System.out.println(new PhoneBuild().buildOldPhone().desc());
        System.out.println(new PhoneBuild().buildPhotoPhone().desc());
    }
}
