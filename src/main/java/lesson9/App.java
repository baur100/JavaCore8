package lesson9;

public class App {
    public static void main(String[] args) {
        Person oleg = new Person("Oleg","Petrov",19);

        Person anna = new Person("Anna");
        anna.setLastName("Sidorova");
        anna.setAge(22);

        Person david = new Person();

        Person sam = new Person("Samuel","Adams",25);

        Vehicle myCar = new Vehicle();
        myCar.setBrand("Toyota");
        myCar.setModel("Prius");
        myCar.setYear(1999);

        myCar.printInfo();

        System.out.println(myCar);
    }
}
