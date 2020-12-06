package homework11;

public class Worker extends Company {
    private String lastName;
    private String position;

    public Worker(Name name, int year, Address address, Field field, String lastName, String position) {
        super(name, year, address, field);
        this.lastName = lastName;
        this.position = position;
    }

}
