package homework11.part1;

public class Address {
    private String streetAddress1;
    private int apt;
    private int zip;

    public Address(String streetAddress1,int apt,int zip){
        this.streetAddress1=streetAddress1;
        this.apt=apt;
        this.zip=zip;
    }
    public Address(){}

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public int getApt() {
        return apt;
    }

    public void setApt(int apt) {
        this.apt = apt;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

}
