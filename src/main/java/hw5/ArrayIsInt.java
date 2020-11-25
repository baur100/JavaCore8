package hw5;

public class ArrayIsInt {
    public static void main(String[] args) {
        int []arr1={1};
        int []arr2={3,-1,7};
        int []arr3={2,2,1,2,4,5,6,7,1};
        System.out.println(sumOfArray(arr2));
        System.out.println(sumOfArray(arr3));
        System.out.println(sumOfArray(arr1));

    }
    public static int sumOfArray(int[]arr){
        int sum=0;
        for (int v : arr){
            sum=sum+v;
        }
        return sum;

    }
}
