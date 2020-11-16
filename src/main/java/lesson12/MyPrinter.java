package lesson12;

public class MyPrinter implements UsElectricPlug, Voltage110Standard {
    private String brand;
    private String model;
    private String type;
    private boolean color;

    public MyPrinter(String brand, String model, String type, boolean color) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
    }

    public void print(String xx){
        System.out.println("I print "+xx);

    }


    @Override
    public void americanPlug() {
        System.out.println("Buy american plug to use me");
    }

    @Override
    public void workUsing110v() {
        System.out.println("110 volt only");

    }
}
