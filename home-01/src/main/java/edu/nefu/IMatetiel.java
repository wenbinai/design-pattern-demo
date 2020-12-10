package edu.nefu;

import edu.nefu.materiel.Matetiel;

/**
 * 构建物料(手机部件)接口
 */
public interface IMatetiel {
    AbstractPhone addCamera(Matetiel matetiel);

    AbstractPhone addNFC(Matetiel matetiel);

    AbstractPhone addGPS(Matetiel matetiel);
}
