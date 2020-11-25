package homework10;

import java.util.Arrays;

public class FarmersInsurance {
    private String address;
    private String name;
    private Cars[] cars;
    private int quote;

    public FarmersInsurance(String address, String name, Cars[] cars, int quote) {
        this.address = address;
        this.name = name;
        this.cars = cars;
        this.quote = quote;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cars[] getCars() {
        return cars;
    }

    public void setCars(Cars[] cars) {
        this.cars = cars;
    }

    public int getQuote() {
        return quote;
    }

    public void setQuote(int quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "FarmersInsurance{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                ", quote=" + quote +
                '}';
    }
}










//// Сделать  2 enum
////Сделать 2 класса - в первом классе field сделать типа Enum
////Во  втором классе - field типа Enum[]