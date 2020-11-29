package LessNew14;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        Person Maria = new Person("Maria");
        people.add(Maria);

        people.add(new Person("Marina"));

        people.add(new Person("Jane"));
        System.out.println(people);

        for (Person p : people){
            System.out.println(p.getName());
        }
        people.forEach(x -> System.out.println(x.getName()));
    }
}
