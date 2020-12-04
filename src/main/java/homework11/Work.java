package homework11;

public class Work {
    public static void main(String[] args) {
        Address davidAddress = new Address("111", "199", "Brooklyn", "NY", 11230);
        Student david = new Student("David", "Ross", 1999, davidAddress, Subjects.HISTORY, "MIT", (short)8);

        Address janeAddress = new Address("1370E", "1270E", "NY", "NY", 11780);
        Teacher jane = new Teacher("Jane", "List", 1970, janeAddress, Subjects.BIOLOGY);

        david.getLastName();


    }

}
