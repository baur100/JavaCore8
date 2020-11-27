package hw4;

public class ArrayNumb {
    public static void main(String[] args) {
        int[]numbers={3,4,6,78,98,-234,-67,-54,88};
        System.out.println(numbers[4]);

        int rem=15%4;
        System.out.println(rem);


//        вывести  четные
        for (int v : numbers){
            if(v%2==0){
                System.out.println(v);
            }
//            вывести не четные
            for (int j : numbers) {
//              or  (int v : numbers)
            }
                if(v%2==1){
//                    или (v%2==1 || v%2==-1) вывести не четные минусы
//                    или (v%2!=0) и дергаться не надо
//                    v перебирает все по очереди
//                    не равен нулю не четные
                    System.out.println(v);
                }}}}


