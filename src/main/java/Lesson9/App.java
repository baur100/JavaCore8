package Lesson9;

public class App {
    public static void main(String[] args) {
        Person Vasile = new Person("Vasile", "Ivan","10");
        Vasile.setName("Vasile");
        Vasile.setLastname("Ivan");
        Vasile.setAge(10);

        System.out.println(Vasile.getName());
        System.out.println(Vasile.getLastName());


    }
}
