package homework11;

public class FirstYearStudent extends Student{
    private Colors color;
    public FirstYearStudent(String name, String lastName, int year, Address address, Subjects major, String college, short term) {
        super(name, lastName, year, address, major, college, term);
        this.color = color;
    }

    @Override
    public String toString() {
        return "FirstYearStudent{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", address=" + address +
                '}';
    }
}
