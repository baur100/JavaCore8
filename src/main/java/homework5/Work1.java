package homework5;

public class Work1 {
    public static void main(String[] args) {
     int[]arr = {2, 3, 5, 6, 7, 8};
       System.out.println(sumOfArray(arr));






    }

    public static int sumOfArray(int[]arr){
        int sum = 0;
        for (int v : arr){
            sum = sum + v;
        }
        return sum;
    }


}

