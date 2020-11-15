package hw12;


public class App {
    public static void main(String[] args) {
        Blender N77 = new Blender("Silver", "Bosch", "N77");
        N77.americanPlug();
        N77.workUsingStandardVolt();
        N77.blenderOff();
        N77.blenderOn();

        Mixer A77 = new Mixer("Silver", "Bosch", "A77");
        A77.mixerOff();
        A77.workUsingStandardVolt();
        A77.mixerOn();
        A77.mixerOff();

    }


}
