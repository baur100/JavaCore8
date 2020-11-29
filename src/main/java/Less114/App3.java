package Less114;

import LessNew14.Person;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Customer> people = new ArrayList<Customer>();
        people.add(new Customer("Crina"));
        people.add(new Customer("Jane"));
        System.out.println(people);

        for (Customer c : people){
            System.out.println(c.getName());
        }
        people.forEach(x -> System.out.println(x.getName()));
    }
}
