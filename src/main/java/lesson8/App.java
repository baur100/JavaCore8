package lesson8;

public class App {
    public static void main(String[] args) {

        Person oleg = new Person();
        oleg.name = "Oleg";
        oleg.lastName = "Ivanov";
        oleg.age = 25;

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Polyakova";
        anna.age=28;

        Person david = new Person();
        david.age=31;
        david.name="David";


        david.greet("Hank");
        anna.greet("David");

//        System.out.println(oleg.lastName);

        Vehicle myCar = new Vehicle();
        myCar.brand = "Toyota";
        myCar.color = "Pink";
        myCar.model = "Prius";
        myCar.year = 2019;

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.year = 1982;
        myFriendsCar.model = "412";
        myFriendsCar.brand = "Moskvich";
        myFriendsCar.color = "Bezh";


//        myCar.beep();
//        myFriendsCar.beep();
//
//        myCar.drive();
//        myFriendsCar.drive();

    }
}
