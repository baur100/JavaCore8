package hw12;

public class Mixer implements ElectricPlug, VoltageStandard {
    private String color;
    private String model;
    private String brand;

    public Mixer(String color, String model, String brand) {
        this.color = color;
        this.model = model;
        this.brand = brand;

    }public void mixerOn() {
        System.out.println(brand + " " + model + " turned on");
    }

    public void mixerOff() {
        System.out.println(brand + " " + model + " turned off");

    }

    @Override
    public void americanPlug() {

    }

    @Override
    public void workUsingStandardVolt() {

    }
}