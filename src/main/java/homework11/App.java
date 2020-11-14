package homework11;

public class App {
    public static void main(String[] args) {
        Address sergeiAddress = new Address("123 Main st", "apt 29", "Anchorage", "AK", 99516);
        Address galinaAddress = new Address("135 Main st", "apt 20", "Charlotte", "NC", 28277);
        Student sergei = new Student("Sergei", "Budkin", 1989, sergeiAddress, Subjects.HISTORY, "MIT", (short) 5);
        Teacher galina = new Teacher("Galina", "Ivanova", 1907, galinaAddress, Subjects.MATH, sergei);

        System.out.println(galina.getBestStudent().getAddress().getCity());


    }
}
