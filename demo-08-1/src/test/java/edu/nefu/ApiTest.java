package edu.nefu;

import edu.nefu.controller.DecorationPackageController;
import edu.nefu.design.Builder;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {
    @Test
    public void test_DecorationPackageController() {
        DecorationPackageController decoration = new DecorationPackageController();

        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"), 1));

        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"), 2));

        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"), 3));
    }

    @Test
    public void test_builder() {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());

    }
}
