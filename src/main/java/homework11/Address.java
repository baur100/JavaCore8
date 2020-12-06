package homework11;

public class Address {
    private String StreetAddress;
    private String city;
    private String state;
    private int zip;

    public Address(String streetAddress, String city, String state, int zip) {
        StreetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        StreetAddress = streetAddress;
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

    @Override
    public String toString() {
        return "Address{" +
                "StreetAddress='" + StreetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}


