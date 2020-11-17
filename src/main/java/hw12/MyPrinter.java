package hw12;

public class MyPrinter implements ElectricPlug,Voltage110vStandart {
    private String brand;
    private String model;
    private String type;
    public boolean color;

    public MyPrinter(String brand, String model, String type, boolean color) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
    }

    public void print(String xx){
        System.out.println("I printed "+xx);
    }


    @Override
    public void americanPlug() {
        System.out.println("Buy American socket too use me");
    }

    @Override
    public void workUsing110v() {
        System.out.println("110 volt only");
    }
}
