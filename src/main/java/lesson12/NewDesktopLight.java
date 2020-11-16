package lesson12;

public class NewDesktopLight implements BulbE27, UsElectricPlug, Voltage110Standard{
    private String color;
    private String brand;
    private String model;

    public NewDesktopLight(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public void LampOn(){
        System.out.println(brand+" "+model+" turned on");
    }
    public void LampOff(){
        System.out.println(brand+" "+model+" turned off");
    }


    @Override
    public void e27BulbStandardSupport() {
        System.out.println("Support E27 bulb");
    }

    @Override
    public void americanPlug() {
        System.out.println("I use american plug");
    }

    @Override
    public void workUsing110v() {
        System.out.println("Working using 100 volt");
    }
}
