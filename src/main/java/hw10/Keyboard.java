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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Colors getColor() { return color; }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getModel(String model) {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getModel() {
    }


    public void mKbrand() {
        System.out.println("I was looking for a brand " + brand);
    }

    public void model() {
        System.out.println("I bought a model " + model);
    }

    public void color() {

        System.out.println("I choose  " + color + " color");
    }

    public void year() {
        System.out.println("I get the last model of " + year);
    }

    public void brand() {
        System.out.println();
    }
}



