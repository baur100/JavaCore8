package homework11;

public class Person {
    protected String name;
    protected String lastName;
    protected int year;
    protected Address address;

    public Person(String name, String lastName, int year, Address address){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
