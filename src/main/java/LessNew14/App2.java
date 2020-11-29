package LessNew14;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Kiwi");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(100);
        numbers.add(18);
        numbers.add(1);
        numbers.add(-1);
        System.out.println(numbers);

        for (int i =0; i< numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        for (int v : numbers){
            System.out.println(v);
        }
        numbers.forEach(x-> System.out.println(x));

        numbers.forEach(System.out::println);
    }
}
