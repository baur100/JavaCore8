package homework4;

public class Work {
    public static void main(String[] args) {
        int[] numbers = {2, 76, 9, 90, 31, 76, 76, 6, 88, 21, 12};
        for (int v : numbers){
            System.out.println(v);

        }

        for (int v : numbers){
            if(v%2 == 0){
            System.out.println(v);
        }
    }
}}
