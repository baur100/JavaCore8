package hw5;

public class Persomalized {
    public static void main(String[] args) {
//        void-->возвратный тип у него нет return; ничего не возвращает
hello("Anna");
hello("Michael");
hello("Nadejda");
hello("Zhyldyz");
//fuction works as personalized

        hi();
    }
    public static void hello(String name){
//        hello--> это имя функции
        System.out.println("Hello, "+ name + "  nice to see you!");
    }
        public static void hi(){
        System.out.println("Today I'm repeating the functions lesson! Wanna cry!");
        System.out.println("Aimira good girl, you did everything is right");
    }
}

