package hw5;

public class Radius {
    public static void main(String[] args) {
//        не правильно вызывать String xx=hi();
//        +++++++++++++++++++++++++++++++++++++
//        printCircleLength(2.3);
//        printCircleLength(5);
//        printCircleLength(10);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        double len1=getCircleLength(2.3);
//        double len2=getCircleLength(5);
//        double len3=getCircleLength(10);
////        System.out.println(len1+" "+len2+" "+len3);
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//      int a=sumOf5numbers(1,4,1,2,3);
//        System.out.println(a);
//        System.out.println(sumOf5numbers(1,1,1,1,1));
//        System.out.println(sumOf9numbers(1,1,1,1,1,1,1,1,1));
//    }
////       public static void printCircleLength(double radius){
//        double length=2*radius*3.14;
////           double length=2*radius*Math.PI;
//           System.out.println("Length of circle with radius "+radius+" = "+length);
//             сумма двух сторок
////           length---> это длина
//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//       }
////       возвращает функцию
//       public static double getCircleLength(double radius){
//        double length = 2*radius*Math.PI;
//        return length;
//       }
////       public static int sumOf5numbers(int a1,int a2,int a3,int a4,int a5){
//        return a1+a2+a3+a4+a5;
//        int возвращает return;
//       }
//        ex+++++++++++++++++++++++++++++++++++++++
//       public static int sumOf9numbers(int a1,int a2,int a3,int a4,int a5,int a6,int a7, int a8, int a9){
//        return a1+a2+a3+a4+a5+a6+a7+a8+a9;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        double example:
        double a = xxOf5numbers(1, 4, 1, 2, 3);
        System.out.println(xxOf5numbers(2, 3, 1, 2, 1));
    }

    public static double xxOf5numbers(int a1, int a2, int a3, int a4, int a5) {
        return (double) a1 / a2 + a3 * a4 + a5;
    }

}
