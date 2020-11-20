package hw14;

import java.util.ArrayList;
import java.util.Arrays;

public class Hwork {
    public static void main(String[] args) {
        String[]brands1=new String[3];
        ArrayList<String>brands=new ArrayList<>();
        brands1[0]="Nike";
        brands.add("Nike");
        brands.set(0,"Jordan");
        System.out.println(brands.get(0));

        System.out.println(brands);
        brands.add("Nike");
        System.out.println(brands);
        brands.add(1,"Adidas");
        System.out.println(brands);
        brands.add(2,"Puma");
        System.out.println(brands);

//        brands.remove(1);
//        System.out.println(brands);
//        System.out.println(brands.size());
//
//        brands.remove("Jordan");
//        System.out.println(brands);
//        System.out.println(brands.size());

        ArrayList<String>AdidasColors=new ArrayList<>(Arrays.asList("Adidas Blue","Puma White","Adidas Hazel","Jordan Black"));
        brands.addAll(AdidasColors);
        System.out.println(brands);

        brands.addAll(1,AdidasColors);
        System.out.println(brands);

        brands.contains(brands);
        System.out.println(brands.contains("Jordan"));
        System.out.println(brands.contains("AirAmerica"));

    }
}
