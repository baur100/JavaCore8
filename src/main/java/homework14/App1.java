package homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1 {
    public static void main(String[] args) {

        List<Integer> year = new ArrayList<>(Arrays.asList(1997,1967,1853,1789));

        System.out.println(year);


        year.add(1958);
        year.remove(2);
        System.out.println(year);

        for (int y : year){
            System.out.println(y);
        }



        }

    }



