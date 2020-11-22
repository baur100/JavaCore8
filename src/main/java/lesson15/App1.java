package lesson15;

public class App1 {
    public static void main(String[] args) {
        int a = 5;
        int b=a;
        b=3;
        System.out.println(a);


        Color a1 = new Color("Red");
        Color b1 = a1;
        b1.setColor("Green");
        System.out.println(a1.getColor());

        int[] numbers = {1,1,2};
        int[] bb = numbers;
        bb[0]=100;

        System.out.println(numbers[0]);


        Person oleg = new Person();
        Person xx = oleg;

        System.out.println(xx == oleg);

        Color red1 = new Color("Red");
        Color red2 = new Color("Red");
        System.out.println(red1==red2);

    }
}
