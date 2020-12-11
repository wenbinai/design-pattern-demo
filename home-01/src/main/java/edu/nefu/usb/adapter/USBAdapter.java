package edu.nefu.usb.adapter;

import edu.nefu.usb.Micro;
import edu.nefu.usb.TypeC;

public class USBAdapter implements TypeC {
    private Micro micro;

    public USBAdapter(Micro micro) {
        this.micro = micro;
    }


    @Override
    public void typeCRead() {
        micro.microRead();
    }

    @Override
    public void quickCharge() {
        micro.microRead();
    }
}
