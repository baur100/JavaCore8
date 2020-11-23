package hw14;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Polymorphizm {
    public static void main(String[] args) {

//    List<String> fruits=new ArrayList<>();
//    fruits.add("Apple");
//     fruits.add("Plum");

//    List<int> numbers=new ArrayList<>(); doesnt work, must be--->
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(100);
        numbers.add(18);
        numbers.add(1);
        numbers.add(-50);
        System.out.println(numbers);

//        using iteration
//        pring using by loops

        for(int i=0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));

            for (int v:numbers){
                System.out.println(v);
            }


        }
    }
}
