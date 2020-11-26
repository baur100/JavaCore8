package hw3;

public class Arrays {
    public static void main(String[] args) {
        System.out.println();
        int x=55;
        double temp=5.6;
        String stroka="Hello, I'm string!";
        int[]temps={65,89,30,45,90};
//        Array хранит много однотипных данных
        System.out.println(temps[0]);
        System.out.println(temps[1]);
        System.out.println(temps[2]);

        temps[0]=62;
        System.out.println(temps[0]);

        String[] names={"John","Jozeph","Dasha","Mary"};
//        names array
        System.out.println((names[3]));
//        +++++++++++++++++++++++++++
        names[0]="Evan";
//        name John changing to Evan
        System.out.println(names[0]);
//        array тип данных как double,integer,
//        array is int;
//        array is String;
//        array is double;
//        int() и int(int)---> different meaning
//        exception ---> это ошибка;
//        String[]colors={"red","pink","Yellow"};
//        System.out.println(colors[2]);
//        System.out.println(colors[0]);

//        numbers[0]=4;
//        numbers[1]=7;
//        numbers[2]=-123;
//        numbers[4]=0;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
        String[]fruits=new String[2];
        System.out.println(fruits[0]);
        fruits[0]="";
        System.out.println(fruits[0]);
        fruits[1]="Apple";
//        любая буква в имени переменной имеет значение ex: numbers or nUmbers;
//        то что в нутри скобок не имеет значения ("ufbvdkfj");

//        Null ---> not good;


//        array from one element--->
//        double[]weirdArray={4.4};
//        System.out.println(weirdArray[0]); pravilno
//        System.out.println(weirdArray[1]); Exception

//        System.out.println(names[names.length-1]); другой вариант вызвать,длтна эррея на 1 размер меньше
//        System.out.println([1]);---> одно и тоже.

    }


}
