package Lesson9;

public class App {
    public static void main(String[] args) {
        Lesson9.Person Vasile = new Lesson9.Person("Vasile", "Ivan","10");
        Vasile.setName("Vasile");
        Vasile.setLastname("Ivan");
        Vasile.setAge(10);

        System.out.println(Vasile.getName());
        System.out.println(Vasile.getLastName());


    }
}
