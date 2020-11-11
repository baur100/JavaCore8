package hw7;

public class Vehicle {

    public String brand;
    public String color;
    public String model;
    public int year;

    public void myCarBrand() {
        System.out.println("Brand " + brand);
    }

    public void myCarColor() {
        System.out.println("color " + color);
    }

    public void myCarModel() {
        System.out.println("model " + model);
    }

    public void myCarAge() {
        System.out.println(year);
    }
}