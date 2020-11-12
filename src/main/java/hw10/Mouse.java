package hw10;

public class Mouse {
    private String brand;
    private String features;
    private Colors color;
    private int year;

    public Mouse(String brand, String features, Colors color, int year) {
        this.brand = brand;
        this.features = features;
        this.color = color;
        this.year = year;
    }

    public void Brand() {
        System.out.println("I look at the brand " + brand);
    }

    public void Model() {
        System.out.println("So I prefer to buy " + features);
    }

    public void Color() {
        System.out.println("I like the " + color + " color");
    }

    public void Year() {
        System.out.println("I took brand new  " + year + " year");
    }

}