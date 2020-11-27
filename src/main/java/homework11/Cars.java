package homework11;

import java.time.Year;

public class Cars {
    protected String make;
    protected String color;
    protected int tyresize;
    protected CarType carType;
    protected EngineType engineType;
    protected int year;

    public Cars(String make, String color, int tyresize, CarType carType, EngineType engineType, int year) {
        this.make = make;
        this.color = color;
        this.tyresize = tyresize;
        this.carType = carType;
        this.engineType = engineType;
        this.year = year;
    }



    public Cars() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTyresize() {
        return tyresize;
    }

    public void setTyresize(int tyresize) {
        this.tyresize = tyresize;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", tyresize=" + tyresize +
                ", carType=" + carType +
                ", engineType=" + engineType +
                ", year=" + year +
                '}';
    }
}
