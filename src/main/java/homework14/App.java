package homework14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {

//        1st array____________________________________________
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("VW");
        System.out.println(cars);

//        2nd array____________________________________________
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(100);
        numbers.add(99);
        numbers.add(98);
        numbers.add(97);
        numbers.add(96);
        numbers.add(95);
        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.set(5,5);
        System.out.println(numbers);
        numbers.add(6,100);
        System.out.println(numbers);

        System.out.println(numbers.contains(100));
        System.out.println(numbers.contains(101));


//        1st method
        for (int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
//        2nd method
        for (int v : numbers){
            System.out.println(v);
        }
//        3rd method
        numbers.forEach(x-> System.out.println(x));
//        4th method
        numbers.forEach(System.out::println);

//        3rd array____________________________________________
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Cherry", "Pear", "Orange", "Mango"));
        System.out.println(fruits);


//        4th array____________________________________________
        List<Person> friends = new ArrayList<>();

        Person toxa = new Person("Anton", "Germanchuk", 1985);
        friends.add(toxa);

        friends.add(new Person("Knstantyn", "Diachenko", 1986));
        friends.add(new Person("ivan","Avvachev", 1988));

        System.out.println(friends);

        for (Person f : friends){
            System.out.println(f.getYear()+" "+f.getLastName()+" "+f.getName());
        }

    }
}
