package edu.nefu;

import edu.nefu.materiel.Matetiel;

public interface IMatetiel {
    AbstractPhone addCamera(Matetiel matetiel);

    AbstractPhone addNFC(Matetiel matetiel);

    AbstractPhone addGPS(Matetiel matetiel);
}
