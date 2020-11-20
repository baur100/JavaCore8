package homework15;

public class Doctor {
    private String name;
    private String lastName;
    private Position positin;

    public Doctor(String name, String lastName, Position positin) {
        this.name = name;
        this.lastName = lastName;
        this.positin = positin;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPositin() {
        return positin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPositin(Position positin) {
        this.positin = positin;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", positin=" + positin;
    }

}
