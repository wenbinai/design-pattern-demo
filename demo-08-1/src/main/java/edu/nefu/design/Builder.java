package edu.nefu.design;

import edu.nefu.ceiling.LevelOneCeiling;
import edu.nefu.ceiling.LevelTwoCeiling;
import edu.nefu.coat.DuluxCoat;
import edu.nefu.coat.LiBangCoat;
import edu.nefu.floor.ShengXiangFloor;
import edu.nefu.tile.DongPengTile;
import edu.nefu.tile.MarcoPoloTile;

public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
