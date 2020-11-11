package lesson5and6HW;

public class HW5 {

    //    #5

    public static void main(String[] args) {
//        1.
        sum();
        System.out.println("_________");
//        2.
        int a = 100;
        int b = 200;
        System.out.println(sum(100, 200));
        System.out.println("__________");
//        3.
        int xx = 50;
        System.out.println(isEven(50));
    }

    //    1.
    public static void sum() {
        System.out.println("5 and 25");
    }

    //    2.
    public static int sum(int a, int b) {
        return a + b;
    }

    //    3.
    public static boolean isEven(int xx) {
        if (xx % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}


//  #5
//1. Создайте метод sum - который в качестве аргумента берет 2 целых числа и печатает их результат на экране.
//        вызовите этот метод из функции main() (подсказка - тип функции будет void)
//        2. Создайте метод sum - который в качестве аргумента берет 2 целых числа и возвращает их сумму.
//        вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран (подсказка - тип функции будет int)
//        3. Создайте метод isEven - который в качестве аргумента берет целое число и если оно четное возвращает true
//        если нечетное - возвращает false
//        вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран

