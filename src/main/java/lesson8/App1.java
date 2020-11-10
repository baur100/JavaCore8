package lesson8;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class App1 {
    public static void main(String[] args) {
        Fruit fr1 = new Fruit();
        fr1.name = "apple";
        fr1.color = "red";
//        fr1.eat();

        Snickers nikeBubble = new Snickers();
        nikeBubble.color = "white";
        nikeBubble.size = 9;
        nikeBubble.brand = "Nike";
        nikeBubble.model = "Bubble";

        nikeBubble.printInfo();

    }
}
