package homework10;

import java.util.Arrays;

public class GeicoInsurance {
    private String address;
    private Cars cars;
    private Drivers driver;
    private int quote;

    public GeicoInsurance(String address, Cars cars, Drivers driver, int quote) {
        this.address = address;
        this.cars = cars;
        this.driver = driver;
        this.quote = quote;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Drivers getDriver() {
        return driver;
    }

    public void setDriver(Drivers driver) {
        this.driver = driver;
    }

    public int getQuote() {
        return quote;
    }

    public void setQuote(int quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "GeicoInsurance{" +
                "address='" + address + '\'' +
                ", cars=" + cars +
                ", driver=" + driver +
                ", quote=" + quote +
                '}';
    }
}







//// Сделать  2 enum
////Сделать 2 класса - в первом классе field сделать типа Enum
////Во  втором классе - field типа Enum[]