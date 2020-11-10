package hw8;

import lesson8.Snickers;

public class App_hw8 {
    public static void main(String[] args) {

        Boots Grinders = new Boots();
        Grinders.brand = "Greenders";
        Grinders.model = "Camelot";
        Grinders.color = "black";
        Grinders.size = 8;

        Grinders.printInfo();

        Scooters Xiaomi =new Scooters();
        Xiaomi.brand = "Xiaomi";
        Xiaomi.model = "m365";
        Xiaomi.color = "black";

        Xiaomi.printInfo();
    }
}
