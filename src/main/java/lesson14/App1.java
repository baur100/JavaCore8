package lesson14;

import java.util.ArrayList;
import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        String[] colors1 = new String[5];
        ArrayList<String> colors = new ArrayList<>();

        colors1[0] = "Red";
        colors.add("Red");
        colors.set(0,"Pink");
        System.out.println(colors.get(0));
        System.out.println(colors);

        colors.add("Red");
        System.out.println(colors);

        colors.add(1,"Blue");
        System.out.println(colors);

//        colors.add(55,"Blue"); - Out of bound exception

        System.out.println(colors.size());

        colors.add("Green");
        colors.add("Black");
        colors.add("Green");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.remove(2);
        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println(colors.remove("Green"));
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.remove("Red"));

        ArrayList<String> lightColors = new ArrayList<>(Arrays.asList("Light Green", "Light Blue"));

        colors.addAll(lightColors);
        System.out.println(colors);

        colors.addAll(1,lightColors);
        System.out.println(colors);

        System.out.println(colors.contains("Red"));
        System.out.println(colors.contains("Blue"));


    }
}
