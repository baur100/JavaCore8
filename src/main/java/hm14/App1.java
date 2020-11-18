package hm14;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> artists = new ArrayList<>();
        artists.add("Leonardo da Vinci");
        artists.add("MichelAngelo");
        artists.add("Pablo Picasso");

        List<Integer> ages = new ArrayList<>();
        ages.add(1);
        ages.add(20);
        ages.add(77);
        ages.add(100);
        System.out.println(ages);


        for (int i = 0; i < ages.size(); i++) {

            System.out.println(ages.get(i));

        }
        for (int v : ages) {
            System.out.println(v);
        }

        ages.forEach(System.out::println);
    }
}
