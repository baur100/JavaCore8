package lesson10;

public class App2 {
    public static void main(String[] args) {
        Address home = new Address("123 Main st","","Gotham", State.CA,92780);


        Person oleg = new Person("Oleg","Lastochkin",Gender.MALE,home);

        System.out.println(oleg);

    }
}
