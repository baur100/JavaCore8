package lesson8;

public class Vehicle {
    public String model;
    public String brand;
    public int year;
    public String color;

    public void beep(){
        System.out.println("Beeep- Beep "+model+" "+brand +" making BEEEP");
    }
    public void drive(){
        System.out.println(color+" car can drive");
    }

}