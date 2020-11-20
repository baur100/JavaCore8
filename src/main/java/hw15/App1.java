package hw15;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String, String> doctors = new HashMap<>();

        doctors.put("Surgeon","Igor Ivanov");
        doctors.put("Gynecologist","Helen Smith");
        doctors.put("Ophthalmologist","Mary Queen");
        doctors.put("Pediatrician","John King");
        doctors.put("Dentist", "Jasmine Clinton");
        System.out.println(doctors);

        Map<Integer, String> treat = new HashMap<>();
        treat.put(1, "teeth");
        treat.put(4, "eyes");
        treat.put(2, "heart");
        treat.put(5, "child");
        System.out.println(treat);

        System.out.println(treat.get(5));
        System.out.println(doctors.get("Gynecologist"));

        doctors.replace("Ophthalmologist","Mary Queen","Amina Azam");
        System.out.println(doctors);

        doctors.remove("Gynecologist","Helen Smith");
        System.out.println(doctors);
//
//
        doctors.compute("Dentist", (a,b) -> b+", the best dentist" );
        System.out.println("_________________");
        doctors.forEach((a,b) -> System.out.println("Position: " +a+" Doctor: "+b));

        doctors.computeIfAbsent("Gynicologist", b -> doctors.get("Helen Smith"));
        doctors.forEach((a,b) -> System.out.println("Position: " +a+" Doctor: "+b));

        String physician = doctors.getOrDefault("Physician", "Unknown");
        System.out.println(physician);

        doctors.merge("Surgeon", "Igor Ivanov", (a, b) -> b+ " and etc." );
        doctors.forEach((a,b) -> System.out.println("Position: " +a+" Doctor: "+b));



        }




    }

