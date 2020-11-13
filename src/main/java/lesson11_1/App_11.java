package lesson11_1;

public class App_11 {
    public static void main(String[] args) {
        Address_11 davidAddress = new Address_11("125 Elm", "Gotum", "IL", 50601);
        Student_11 student = new Student_11("David", "Ross", 1985, davidAddress,Subjects.BOILOGY, "MIT", (short) 5);

        Address_11 janeAddress = new Address_11("135 Elm", "NY", "NY", 35264);
        Teacher jane = new Teacher("Jane", "Green", 1984, janeAddress,Subjects.CYBERTECHNOLOGY, "MIT", (short) 4);
    }
}
