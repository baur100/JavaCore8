package homework15;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String,String> couples=new HashMap<>();
        System.out.println(couples.size());
        couples.put("Nadya","Marshall");
        couples.put("Larisa","Andrei");
        couples.put("Lena","Iliya");
        couples.put("Dasha","Dima");
        System.out.println(couples);
        System.out.println(couples.size());
        couples.put("Dasha","Alex");
        System.out.println(couples);

        Map<Integer,String>temp=new HashMap<>();
        temp.put(0,"Low");
        temp.put(1,"Medium");
        temp.put(2,"High");
        System.out.println(temp);

        temp.remove(0);
        System.out.println(temp);
        temp.replace(2,"Highest");
        System.out.println(temp);

        Collection boys=couples.values();
        List values=new ArrayList(boys);

        values.forEach(System.out::println);

        Set<String>keys=couples.keySet();
        for(String v:keys){
            System.out.println(v);
        }
        for(String v: couples.keySet()){
            System.out.println(v);
        }
        for(String v:couples.values()){
            System.out.println(v);
        }
        for(Map.Entry<String,String>v: couples.entrySet()){
            System.out.println(v.getKey()+" + "+v.getValue()+"= love");
        }


    }
}
