package homework13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WORKKS13 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        List<Integer> aa = new ArrayList<>();
        List<Tools> tt = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Volvo");

        System.out.println(cars);

        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(4);
        aa.add(5);
        System.out.println(aa);

        tt.add(new Tools("Makita"));
        tt.add(new Tools("Dewolt"));
        tt.add(new Tools("Fine"));
        tt.add(new Tools("Milwakee"));
        System.out.println(tt);
        for (Tools t : tt) {
            System.out.println(t.getMake());

        }
    }
}
//Create 3ArrayList-String,Integer and some Custom
//
//class
//Add 4+elements to each List
//        excersize methods add/set/remove/get/foreach and etc