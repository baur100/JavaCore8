package Lesson10;

public class App2 {

    public static void main(String[] args) {
        Mouse PP = new Mouse("Venoy", "PP",ConnectionType.Wired_USB);
        Computer Lenovo = new Computer("Kiki",Mouse.class,"Screen","HDD");
    }
}
