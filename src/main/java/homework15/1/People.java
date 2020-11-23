package homework15;

import java.util.HashMap;
import java.util.Map;

public class People {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Mary", 1996);
        people.put("Kate", 2000);
        people.put("Mike", 1968);
        people.put("Denis", 1979);

        System.out.println(people);

        for (Integer v : people.values()){
            System.out.println(v);
        }

        for (Map.Entry<String, Integer> v: people.entrySet()){
            System.out.println(v.getKey()+ " " + v.getValue());
        }

        people.remove("Denis", 1979);
        System.out.println(people);

    }
}
