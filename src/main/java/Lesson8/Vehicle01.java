package Lesson8;

public class Vehicle01 {
    public String brand;
    public String model;
    public String year;
    public String color;

    // public void opendoors(){
    //    System.out.println("opendoors" + model + "  " + color + "Car");

    public Vehicle01(String brand, String model, String year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void jump(){

    System.out.println("New Red Car"    +    "jump" + model);
        }
    }


