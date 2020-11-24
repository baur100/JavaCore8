package homework16;


public class Address {
    private String streetAddress;
    private String city;
    private State state;
    private int zip;

    public Address(String streetAddress, String city, State state, int zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    @Override
    public String toString() {
        return " " +
                "" + streetAddress +
                ", " + city +
                ", " + state +
                " " + zip;
    }
}
