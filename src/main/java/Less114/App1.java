package Less114;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        numbers.set(2,1);
        System.out.println(numbers);
        System.out.println(numbers.get(1));
    }
}
