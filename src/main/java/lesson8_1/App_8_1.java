package lesson8_1;

import lesson8_1.Vehicle_1;

public class App_8_1 {
    public static void main(String[] args) {

        Person_1 Oleg = new Person_1();
        Oleg.name = "Oleg";
        Oleg.lastName = "Ivanov";
        Oleg.age = 25;

        Person_1 Anna = new Person_1();
        Anna.name = "Anna";
        Anna.lastName = "Polykova";
        Anna.age = 28;

        Person_1 David = new Person_1();
        David.name = "David";
        David.age = 31;

//        System.out.println(Oleg.lastName);

        Vehicle_1 myCar = new Vehicle_1();
        myCar.brand= "Toyota";
        myCar.color = "Black";
        myCar.model = "Prius";
        myCar.year = 2019;

        Vehicle_1 myFriendsCar = new Vehicle_1();
        myFriendsCar.year = 1982;
        myFriendsCar.model = "2106";
        myFriendsCar.brand = "LADA";
        myFriendsCar.color = "Blue";


        //        myCar.beep();
//        myFriendsCar.beep();
//
//        myCar.drive();
//        myFriendsCar.drive();

    }
}
