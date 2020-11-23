package homework15;


import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        Map<homework15.Name, homework15.Color> Fruits = new HashMap<>();
        Fruits.put(new homework15.Name("Apple"), new homework15.Color("Red"));
        Fruits.put(new homework15.Name("Banana"), new homework15.Color("Yellow"));
        Fruits.put(new homework15.Name("Orange"), new homework15.Color("Orange"));

        System.out.println(Fruits);

        for (homework15.Color v : Fruits.values()){
            System.out.println(v);


        }
        for (homework15.Name v: Fruits.keySet()){
            System.out.println(v);
        }



    }}
