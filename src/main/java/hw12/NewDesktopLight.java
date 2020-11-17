package hw12;

public class NewDesktopLight implements BulbE27,  ElectricPlug, Voltage110vStandart {
//    implements-->eto deistviya
    private String color;
    private String brand;
    private String model;

    public NewDesktopLight(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public NewDesktopLight() {
        System.out.println();
    }

    public void lampOn(){
        System.out.println(brand+" "+model+ " turned on");
    }
    public void lampOff(){
        System.out.println(brand+" "+model+ " turned off");
    }

    @Override
    public void e27bulbStandardSupport(){
    System.out.println("Support E27 bulb");
}
    @Override
    public void americanPlug() {
        System.out.println("I use American Electric Plug");
    }

    @Override
    public void workUsing110v() {
        System.out.println("Working using 110 volt");
    }
}
