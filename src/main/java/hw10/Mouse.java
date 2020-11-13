package hw10;

import java.sql.Connection;

public class Mouse {
    private String brand;
    private String features;
    private Colors color;
    int year;
    private Object Colors;


    public Mouse(String brand, String features, Colors color, int year) {
        this.brand = brand;
        this.features = features;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getfeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public Colors getColor(Colors color) {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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

    public void getColor() {
    }
}




