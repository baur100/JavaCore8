package hw10;

public class Keyboard {
    private String brand;
    private String model;
    private Colors color;
    private int year;
    public Keyboard(String brand, String model, Colors color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }
   public void mKbrand() {
        System.out.println("I was looking for a brand " +brand);
    }
    public void model() {
        System.out.println("I bought a model " +model);
    }
    public void color() {

        System.out.println("I choose  " +color+ " color");
    }

    public void year() {
        System.out.println("I get the last model of " +year);
    }
    public void brand() {
        System.out.println();
    }
}



