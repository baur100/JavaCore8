package hw13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Wood");
        System.out.println(list.size());

        list.add("Trees");
        System.out.println(list.size());

        list.add("Animals");
        System.out.println(list.size());

        list.add("Birds");
        System.out.println(list.size());

        System.out.println(list);

        System.out.println(list.get(3));

        list.set(1,"Grass");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.add("Car");
        list.add("Boat");
        list.add("Cruse");
        list.add("House");
        list.add("Bike");
        System.out.println(list);

        list.remove("Boat");
        System.out.println(list);

        list.add("Snowboard");
        System.out.println(list);

        ArrayList<String> listExemple = new ArrayList<String>(Arrays.asList("Grass", "Animals"));
        list.removeAll(listExemple);
        System.out.println(list);

        list.forEach(y-> System.out.println(y));

        ArrayList<Integer> list_integers = new ArrayList<Integer>();
        List<String> colors = new ArrayList<String>();
        colors.add("White");
        colors.add("Green");
        colors.add("Gray");
        colors.add("Yellow");
        colors.add("Brown");
        colors.add("Silver");
        System.out.println(colors);

        ArrayList<Car13> car =new ArrayList<Car13>();

        Car13 dodge = new Car13("Dodge","Caliber","Red", 2002);
        Car13 ford = new Car13("Ford","Mondeo","Blue", 2000);
        Car13 toyota = new Car13("Toyota","RAV","Black", 2004);
        Car13 suzuki = new Car13("Suzuki","Vitara","White", 2001);
        car.add(dodge);
        car.add(ford);
        car.add(toyota);
        car.add(suzuki);

        System.out.println(car);

        car.forEach(x-> System.out.println(x));
        Car13 audi = new Car13("Audi","RS8","Yellow", 2020);

        car.set(3,audi);
        System.out.println(car);

        System.out.println(car.get(1));
    }
}
