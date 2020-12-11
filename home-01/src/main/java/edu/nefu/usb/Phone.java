package edu.nefu.usb;

import edu.nefu.usb.adapter.USBAdapter;
import edu.nefu.usb.impl.MicroImpl;
import edu.nefu.usb.impl.TypeCImpl;

public class Phone {
    private TypeC typeC;

    public Phone(TypeC typeC) {
        this.typeC = typeC;
    }

    public static void main(String[] args) {
        Phone phone = new Phone(new TypeCImpl());
        phone.typeC.quickCharge();
        phone.typeC.typeCRead();

        phone = new Phone(new USBAdapter(new MicroImpl()));
        phone.typeC.typeCRead();
        phone.typeC.quickCharge();

    }
}
