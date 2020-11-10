package lesson9_1;


public class App_9_1 {
    public static void main(String[] args) {
        Person_9_1 oleg = new Person_9_1("Oleg","Petrov",19);

        Person_9_1 anna = new Person_9_1("Anna");
        anna.setLastName("Sidorova");
        anna.setAge(22);

        Person_9_1 david = new Person_9_1();

        Person_9_1 sam = new Person_9_1("Samuel","Adams",25);

        Vehicle_9_1 myCar = new Vehicle_9_1();
        myCar.setBrand("Toyota");
        myCar.setModel("Prius");
        myCar.setYear(1999);

        myCar.printInfo();

        System.out.println(myCar);
    }
}
