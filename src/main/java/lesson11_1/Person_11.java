package lesson11_1;

public class Person_11 {
    protected String name;
    protected String lastName;
    protected int year;
    protected Address_11 address;

    public Person_11(String name, String lastName, int year, Address_11 address) {
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

    public Address_11 getAddress() {
        return address;
    }

    public void setAddress(Address_11 address) {
        this.address = address;
    }
}
