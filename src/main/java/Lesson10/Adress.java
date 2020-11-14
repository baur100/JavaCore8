package Lesson10;

public class Adress {
    public static Lesson10.Adress Adress;
    private String streetadd1;
    private String streetadd2;
    private String city;
    private String state;

    public Adress(String streetadd1, String streetadd2, String city, String state) {
        this.streetadd1 = streetadd1;
        this.streetadd2 = streetadd2;
        this.city = city;
        this.state = state;
    }
    public String getStreetadd1() {
        return streetadd1;
    }

    public void setStreetadd1(String streetadd1) {
        this.streetadd1 = streetadd1;
    }

    public String getStreetadd2() {
        return streetadd2;
    }

    public void setStreetadd2(String streetadd2) {
        this.streetadd2 = streetadd2;
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

    public String toString() {
        return "Adress{" +
                "streetadd1='" + streetadd1 + '\'' +
                ", streetadd2='" + streetadd2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
        }
    }