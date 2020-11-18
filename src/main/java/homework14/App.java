package homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> fingers = new ArrayList<>();
        fingers.add("Thumb");
        System.out.println(fingers);

        fingers.add("Index");
        fingers.add("Middle");
        System.out.println(fingers);

        ArrayList<String> lastFingers = new ArrayList<>(Arrays.asList("Ring", "Pinkey"));
        fingers.addAll(lastFingers);
        System.out.println(fingers);

        fingers.add(1, "Broken");
        System.out.println(fingers);

//        fingers.add(7,"Seventh");
//        System.out.println(fingers);
        fingers.remove(5);
        System.out.println(fingers);
        System.out.println(fingers.size());

        System.out.println(fingers.remove("Ring"));
        System.out.println(fingers);

        System.out.println(fingers.contains("Middle"));
        System.out.println(fingers.contains("Ring"));


        List<Integer> random = new ArrayList<>();
        random.add(0);
        random.add(1);
        random.add(2);
        random.add(3);
        random.add(4);
        System.out.println(random);
        System.out.println("***************");
        for (int i = 0; i < random.size(); i++) {
            System.out.println(random.get(i));

        }


        for (int v : random) {
            System.out.println(v);
        }
        random.forEach(x -> System.out.println(x));
        random.forEach(System.out::println);


        List<Patient> people = new ArrayList<Patient>();
        List<Problems> sicknes = new ArrayList<>();
        sicknes.add(Problems.BACK);
        sicknes.add(Problems.NECK);
        sicknes.add(Problems.SHOLDERS);
        System.out.println("*****************");

        Patient nadya = new Patient("Nadya", 101, sicknes);
        people.add(nadya);
        System.out.println(nadya.toString());
        nadya.printProblems(sicknes);

        people.add(new Patient("Marshall", 102,sicknes));
        people.add(new Patient("Kiano", 103,sicknes));
        people.add(new Patient("Kai", 104,sicknes));
        people.add(new Patient("Kodi", 105,sicknes));

        for (Patient p : people) {
            System.out.println(p.getId());
        }
        people.forEach(p -> System.out.println(p.getName()));
    }
}
