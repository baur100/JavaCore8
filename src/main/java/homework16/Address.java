package homework16;

public class Address {
    private String streetAddress;
    private String town;
    private String State;
    private int zip;

    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        State = state;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return State;
    }

    public int getZip() {
        return zip;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    public void setTown(String town) {
        this.town = town;
    }

    public void setState(String state) {
        State = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "\nstreet:" + streetAddress +
                ", town:" + town +
                ", State:" + State +
                ", zip:" + zip;
    }
}



