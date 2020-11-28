package Less.New11;

public class Address {
    private String StreetAdd1;
    private String StreetAdd2;
    private String city;
    private String state;
    private int zip;

    public Address(String StreetAdd1,String StreetAdd2,String city,String state, int zip){
        this.StreetAdd1 = StreetAdd1;
        this.StreetAdd2 = StreetAdd2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getStreetAdd1() {
        return StreetAdd1;
    }
    public void setStreetAdd1(String StreetAdd1){
        this.StreetAdd1 = StreetAdd1;
    }
    public String getStreetAdd2() {
        return StreetAdd2;
    }
    public void setStreetAdd2(String StreetAdd2){
        this.StreetAdd2 = StreetAdd2;
    }
    public String getCity(){
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    private int getzip(int zip) {
        return zip;
    }
    private void setZip(int zip) {
        this.zip = zip;
    }
}
