package lesson11;

public class Address {
    private String streetAddress1;
    private String city;
    private String state;
    private int zip;

    public Address(String streetAddress1, String city, String state, int zip) {
        this.streetAddress1 = streetAddress1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
