package lesson8;

public class App1 {
    public static void main(String[] args) {
        Fruit fr1 = new Fruit();
        fr1.name = "Apple";
        fr1.color = "Red";
        fr1.eat();

        Snickers nikeBubble = new Snickers();
        nikeBubble.color = "white";
        nikeBubble.size = 9;
        nikeBubble.brand = "Nike";
        nikeBubble.model = "Bubble";

        nikeBubble.printInfo();

    }
}
