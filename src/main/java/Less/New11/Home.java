package Less.New11;

public class Home extends Person{
    private String number;
    private String floor;

    public Home(String name, String lastname, int year, Address address, String number, String floor) {
        super(name, lastname, year, address);
        this.number = number;
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}

