package hw10;

import lesson10.ConnectionType;

public class App_10 {
    public static void main(String[] args) {
        Processor_10 ryzen5 = new Processor_10("AMD", "Ryzen 5 2600 OEM", 8390);
        Motherboard_10 b450m = new Motherboard_10("Gigabyte", "B450M DS3H", 5190);
        SystemBlock_10 iruHome = new SystemBlock_10("Dell", ryzen5, b450m, 13580);
        Keyboard_10 multiDevice = new Keyboard_10("LOGITECH", "WIRELESS", 3580);
        Monitore_10 vision = new Monitore_10("BENQ", "EX3501R", 35, 55950);
        Mouse_10 trackBall = new Mouse_10("LOGITECH", "WIRELESS", ConnectionType.WIRED_USB, 7680);

        Computer_10 dell = new Computer_10(iruHome, multiDevice, trackBall, vision);
        dell.printInfo();
    }
}
