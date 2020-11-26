package hw5;

public class functions {
//    functions--это отдельно повторяющийся кусочек кода
public static void main(String[] args) {
    hi();
    System.out.println("3+4=+7");
    hi();
    hi();
    hello();
    hello();
}

    public static void hi() {
        System.out.println("Hello, today is beautiful day!");
        System.out.println("Let's go trick-and-treat");
    }
    public static void hello(){
        System.out.println("Hello I am a bug!");
    }
}
