package homework15;


import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        Map<Name, Color> Fruits = new HashMap<>();
        Fruits.put(new Name("Apple"), new Color("Red"));
        Fruits.put(new Name("Banana"), new Color("Yellow"));
        Fruits.put(new Name("Orange"), new Color("Orange"));

        System.out.println(Fruits);

        for (Color v : Fruits.values()){
            System.out.println(v);


        }
        for (Name v: Fruits.keySet()){
            System.out.println(v);
        }



    }}
