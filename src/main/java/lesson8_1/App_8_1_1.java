package lesson8_1;

import lesson8.Fruit;
import lesson8.Snickers;

public class App_8_1_1 {
    public static void main(String[] args){
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
