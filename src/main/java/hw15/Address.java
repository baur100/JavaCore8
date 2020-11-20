package hw15;

import java.awt.*;

public class Address {
    private String street;
    private String town;
    private String state;
    private  int zip;

    public Address(String street, String town, String state, int zip) {
        this.street = street;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
