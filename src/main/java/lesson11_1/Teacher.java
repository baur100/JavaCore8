package lesson11_1;

public class Teacher extends Person_11{
    private Subjects major;

    public Teacher(String name, String lastName, int year, Address_11 address, Subjects major) {
        super(name, lastName, year, address);
        this.major = major;
    }
}
