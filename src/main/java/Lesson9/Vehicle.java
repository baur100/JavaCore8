package Lesson9;

import java.sql.SQLOutput;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        if (year < 1880 || year > 2020) {
            throw new IllegalArgumentException("Wrong year passed");
        }
    }

    public int getYear() {
        return year;
    }
    private void printInfo(){
        System.out.println();
    }
}
