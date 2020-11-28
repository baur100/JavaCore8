package Less.New12;

public class Smartphone implements Charger,SimCard{
    private String color;
    private String brand;
    private String model;

    public Smartphone(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public void Call(){
        System.out.println(brand+"  "+model+" Call in ");
    }
    public void VideoCall(){
        System.out.println(brand+"   "+model+" Video Call");
    }

    @Override
    public void USBCharger() {
        System.out.println("Support Wireless Charger");
    }

    @Override
    public void AmericanStandard() {
        System.out.println("I use American Standard Sim");
    }
}
