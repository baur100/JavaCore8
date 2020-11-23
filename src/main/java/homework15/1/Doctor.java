package homework15;

public class Doctor {
    private String name;
    private String lastName;
    private homework15.Position position;


    public Doctor(String name, String lastName, homework15.Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
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

    public homework15.Position getPosition() {
        return position;
    }

    public void setPosition(homework15.Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }
}
