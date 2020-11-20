package hm14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String []colors1 = new String[5];
        ArrayList<String> colors = new ArrayList<>();

        colors1 [0]= "Red";
        colors.add("Red");
        colors.set(0, "Pink");
        System.out.println(colors.get(0));

        System.out.println(colors);
        colors.add("Red");
        System.out.println(colors);
        colors.add(1, "Blue");
        System.out.println(colors);

//        colors.add(5,"Blue");


        colors.add("Green");
        colors.add("Silver");
        colors.add("Gold");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.remove(2);
        System.out.println(colors);
        System.out.println(colors.size());

        colors.remove("Green");
        System.out.println(colors);
        System.out.println(colors.size());

              ArrayList<String>LightColors = new ArrayList<>(Arrays.asList("Light Green", "Light Blue"));
        colors.addAll(LightColors);
        System.out.println(colors);
        colors.addAll(1, LightColors);
        System.out.println(colors);

        System.out.println(colors.contains("Red"));



    }

}
