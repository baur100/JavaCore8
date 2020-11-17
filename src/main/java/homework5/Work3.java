package homework5;

public class Work3 {
    public static void main(String[] args) {
        int[]arr = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(max(arr));



    }

    public static int max (int[]arr){
        int max=arr[0];
        for(int v:arr){
            if (v>max){
                max=v;
            }
        }
        return max;
    }
}
