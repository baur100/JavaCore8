package Less.New12;

public class MyTablet implements SimCard,Charger{
    private String Brand;
    private String color;
    private String model;

    public MyTablet(String brand, String color, String model) {
        Brand = brand;
        this.color = color;
        this.model = model;
    }

    public void game(String xx){
        System.out.println("I can play game "+xx);
    }

    @Override
    public void USBCharger() {
        System.out.println("Charge me");
    }

    @Override
    public void AmericanStandard() {
        System.out.println("Don't need SimCard");

    }
}
