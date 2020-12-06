package homework11;

public class Company {
    protected Name name;
    protected int year;
    protected Address address;
    protected Field field;

    public Company(Name name, int year, Address address, Field field) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.field = field;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
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

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name=" + name +
                ", year=" + year +
                ", address=" + address +
                ", field=" + field +
                '}';
    }
}

