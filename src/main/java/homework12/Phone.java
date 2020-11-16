package homework12;

import javax.sound.midi.Soundbank;

public class Phone extends CellPhone{


    public Phone(String brand, String model, OperatingSystem os) {
        super(brand, model, os);
    }

    @Override
    public void getCellPhoneInfo() {
        System.out.println("phone info: "+brand+" "+model+" "+os);

    }


    @Override
    public void lithiumIonBatteryStandard() {
        System.out.println("Lithium battery is standard to use in the cell phone");
    }

    @Override
    public void workingUsing110v() {
        System.out.println("always use 110v in the US");
    }
}
