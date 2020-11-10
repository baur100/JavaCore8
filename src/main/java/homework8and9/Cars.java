package homework8and9;

public class Cars {
    public String make;
    public String model;
    public int year;
    public double engine;

    public void beep() {
        System.out.println("Bee - Beep " + model + " " + make + " making BEEP");
    }
    public void printCarInfo() {
        System.out.println(make+" "+ model + " " +year+ " "+engine);
    }
}
