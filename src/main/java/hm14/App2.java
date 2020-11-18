package hm14;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        Person David = new Person("Daonald");
        people.add(David);

        people.add(new Person("Diana"));
        people.add(new Person("Alex"));
        people.add(new Person("Angelina"));

        for (Person p : people) {
            System.out.println(p.getName());

            people.forEach(x -> System.out.println(x.getName()));

        }
    }
}
