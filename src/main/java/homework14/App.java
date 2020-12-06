package homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> shapes = new ArrayList();

        shapes.add("square");
        shapes.add("circle");
        shapes.add("triangle");
        System.out.println(shapes);

        shapes.set(1,"oval");
        System.out.println(shapes);

        shapes.remove("square");
        System.out.println(shapes);

        shapes.forEach(System.out::println);

        }







    }


