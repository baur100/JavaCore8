package Lesson9;

public class App {
    public static void main(String[] args) {
        Person oleg = new Person("Oleg", "Petrov", 19);

        Person anna = new Person("ann");
        anna.setLastName("Sidorova");
        anna.setAge(22);

        Person david = new Person();
        Person sma = new Person("samual","adams",25);


//        oleg.setName("Oleg");
//        oleg.setLastName("Petrov");
//        oleg.setAge(10);
//        System.out.println(oleg.getName());

        Vehicle myCar = new Vehicle();
        myCar.setBrand("toyota");
        myCar.setModel("prius");
        myCar.setYear(1999);

    }

}
