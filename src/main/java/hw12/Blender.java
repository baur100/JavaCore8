package hw12;

public class Blender implements ElectricPlug, VoltageStandard {
    private String color;
    private String model;
    private String brand;

    public Blender(String color, String model, String brand) {
        this.color = color;
        this.model = model;
        this.brand = brand;
    }

    public void blenderOn() {
        System.out.println(brand + " " + model + " turned on");
    }

    public void blenderOff() {
        System.out.println(brand + " " + model + " turned off");


    }

    @Override
    public void americanPlug() {
        System.out.println("I use american Plug");

    }

    @Override
    public void workUsingStandardVolt() {
        System.out.println("Work using 110 volt");
    }
}
