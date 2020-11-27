package hw5;

public class MaxMinArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] reverse=reverseArray(arr);
//        ________________________________
//        int[]arr1={2,-3,-4,-5,7};
//        int[] reverse=reverseArray(arr1);
//         _______________________________
//        for(int v : reverse){
//            System.out.println(v);
//        }
//    возвращаемый тип тоже может быть эреем
//    reverse function
//    public static int[] reverseArray(int[]arr){
//        int [] ret=new int[arr.length];
//
//        for (int i=0;i<arr.length;i++){
//            ret[arr.length-i-1]=arr[i];
//        __________________________________
        int[] arr1={2,45,23,2,12,-34,6,2};
        int[] arr2={2};
        int[] arr3={-12,3,4,5,78,90,-111};

        System.out.println(max(arr1));
        System.out.println(max(arr2));
        System.out.println(max(arr3));
    }

    public static boolean max(int[] arr) {
        int max = arr[0];

        for (int v : arr) {
            if (v > max) {
                max = v;
                System.out.println(max);
            }}
//        return false;????}needs to resolve
        return false;
    }}
//





