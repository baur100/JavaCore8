package sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,5,4,9,7,8};

        int[] sorted = sortArray(arr);

        for (int v:sorted){
            System.out.println(v);
        }


    }
    public static int[] sortArray(int[]arr){
        Arrays.sort(arr);
        return arr;
    }



}
