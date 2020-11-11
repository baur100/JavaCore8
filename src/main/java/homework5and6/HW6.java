package homework5and6;

import java.util.Arrays;

public class HW6 {
    public static void main(String[] args) {
//        #6

//        1.
        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arr));
        System.out.println("____________");
//        2.
        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};
        sort(arr1);
        System.out.println("____________");
//        3 max
        int[] zz = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(max(zz));
        System.out.println("__________");
//        3 min
        int[] qq = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(min(qq));


    }

    //        1.
    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum = sum + v;
        }
        return sum;

    }

    //          2.
    public static void sort(int[] arr1) {
        Arrays.sort(arr1);
        for (int v : arr1) {
            System.out.println(v);
        }
    }

    //              3 max
    public static int max(int[] arr2) {
        int max = arr2[0];
        for (int v : arr2) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

  //                3 min
    public static int min(int[] arr3) {
        int min = arr3[0];
        for (int v : arr3) {
            if (v < min) {
                min = v;
            }
        }
        return min;

    }
}

///   #6
//// 1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
////вызовите этот метод из функции main() - подайте в качестве параметра {2,3,5,6,7,8}
////2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
////вызовите этот метод внутри функии main()
////подайте в качестве параматра {3,9,1,8,4,8,5}
////3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
////(группа мак - макчимальное/ группа win - минимальное)
////подайте в качестве параматра {3,9,1,8,4,8,5}