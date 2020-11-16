package lesson12_1;

public class NewDescktopLight_12 implements BulbE27, UsElectricPlug_12 {
    private String color;
    private String brand;
    private String model;

    public void lampOn() {
        System.out.println(brand + " " + model + " turned on");
    }

    public void lampOn() {
        System.out.println(brand + " " + model + " turned off");
    }

    @Override
    public void e27bulbStandardSupport() {
        System.out.println("Support E2 bulb");
    }

    @Override
    public void americanPlug() {
        System.out.println("I use American Electric Plug");

    }
}
