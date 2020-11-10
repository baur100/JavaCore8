package lesson9_1;

public class Vehicle_9_1 {
    private String brand;
    private String model;
    private int year;

    public Vehicle_9_1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public Vehicle_9_1(){}

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<1880 || year>2021){
            throw new IllegalArgumentException("Wrong year passed in");
        }
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}');
    }
}
