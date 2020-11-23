package hw5;

public class SumOf2 {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(3.6,4.5));
        System.out.println(sum("hi","-hello"));
    }
//    ++++++++++++++++++++++++++++++++++++++++++
//    sum  имя функции|| (int a, int b)---> это аргумент
    public static int sum(int a, int b){
        return a+b;
    }
//    +++++++++++++++++++++++++++++++++++++++++
//    function over loading: перегрузка имен функций
    public static double sum(double a, double b){
        return a+b;
    }
//    ++++++++++++++++++++++++++++++++++++++++++++
    public static String sum (String a, String b){
        return a+b;
    }
}

