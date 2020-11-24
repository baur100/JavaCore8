package homework9;

public class Vehicle {
    private String brand;
    private Colors color;
    private int year;
    private VehicleType type;

    public Vehicle(String brand, Colors color, int year, VehicleType type){
        this.brand = brand;
        this.color = color;

        this.year = year;
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }public void setYear(int year){
        if(year>2021||year<1880){
            throw new IllegalArgumentException("Wrong year");
        }this.year=year;
    }
    public int getYear(){
        return year;
    }


}








