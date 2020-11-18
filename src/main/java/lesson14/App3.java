package lesson14;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        Person david = new Person("David");
        people.add(david);

        people.add(new Person("Marina"));

        people.add(new Person("Jane"));

//        System.out.println(people);

        for (Person p : people){
            System.out.println(p.getName());
        }

        people.forEach(p -> System.out.println(p.getName()));

    }

}
