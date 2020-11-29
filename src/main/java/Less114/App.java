package Less114;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        System.out.println(fruits);

        fruits.set(0,"Orange");
        System.out.println(fruits.get(0));
        System.out.println(fruits);
        System.out.println(fruits.size());

        fruits.add("Plum");
        fruits.add("Cerry");
        System.out.println(fruits);

        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.size());


    }
}
