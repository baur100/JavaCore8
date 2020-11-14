package Lesson10;

public class MyFriend {
    private String name;
    private String lastname;
    private Adress adress;
    private City city;
    private String[] state;

    public MyFriend(String name, String lastname, Adress adress, City city, String[] state) {
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;
    }
}
