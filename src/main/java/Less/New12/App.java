package Less.New12;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
        Smartphone Nokia = new Smartphone("Red", "Tuchscreen","Nokia");
        Nokia.AmericanStandard();
        Nokia.USBCharger();

        Nokia.Call();
        Nokia.VideoCall();

        MyTablet MM = new MyTablet("Game","white","Apple");
        MM.AmericanStandard();
        MM.USBCharger();

        SimCard vv = new MyTablet("Game","white","Apple");
        SimCard bb = new Smartphone("Red", "Tuchscreen","Nokia");
        Charger ss = new Smartphone("Red", "Tuchscreen","Nokia");
        ss.USBCharger();
        bb.AmericanStandard();
        vv.AmericanStandard();

    }
}
