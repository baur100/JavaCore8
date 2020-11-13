package homework10;

public class CPU {
    private String brand;
    private int numberOfCores;
    private double speedGHz;

    public CPU(String brand, int numberOfCores, double speedGHz) {
        this.brand = brand;
        this.numberOfCores = numberOfCores;
        this.speedGHz = speedGHz;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getSpeedGHz() {
        return speedGHz;
    }

    public void setSpeedGHz(double speedGHz) {
        this.speedGHz = speedGHz;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "brand='" + brand + '\'' +
                ", numberOfCores=" + numberOfCores +
                ", speedGHz=" + speedGHz +
                '}';
    }
}
