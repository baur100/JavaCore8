package lesson15;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        System.out.println(capitals.size());
        capitals.put("Germany","Berlin");
        capitals.put("UK","London");
        capitals.put("India","New Delhi");
        capitals.put("France","Paris");
        System.out.println(capitals);
        capitals.put("Germany","Bonn");
        System.out.println(capitals);
        capitals.put("England","London");
        System.out.println(capitals);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Hi");
        map.put(0,"Hello");
        map.put(3,"Hey");

//        System.out.println(map);
//        System.out.println(map.get(0));
//        System.out.println(capitals.get("Germany"));

        map.remove(0);
//        System.out.println(map);
        map.replace(1,"Go");
//        System.out.println(map);
        capitals.putIfAbsent("Germany","Berlin");
//        System.out.println(capitals);

        Collection valuesOfCapitals = capitals.values();
        List values = new ArrayList(valuesOfCapitals);

//        values.forEach(System.out::println);

        Set<String>keys = capitals.keySet();
        for(String v: keys){
//            System.out.println(v);
        }

        for (String v : capitals.keySet()){
//            System.out.println(v);
        }

        for (String v : capitals.values()){
//            System.out.println(v);
        }

        for (Map.Entry<String,String> v : capitals.entrySet()){
            System.out.println(v.getKey() + " " + v.getValue());
        }

        Map<Moon,Person> planets = new HashMap<>();
        planets.put(new Moon(),new Person());
        planets.put(new Moon(),new Person());
        planets.put(new Moon(),new Person());
        planets.put(new Moon(),new Person());
        System.out.println(planets.size());


    }
}
