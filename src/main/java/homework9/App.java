package homework9;

public class App {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.setBrand("Iphone");
        myPhone.setModel("11 Max Pro");
        myPhone.setYear(2019);

        myPhone.printClass();

        Dog kris = new Dog("Kris", "Black", 20);
        kris.printDogAge();
        Dog busta = new Dog();
        busta.setName("Busta");
        busta.setColor("Brown");
        busta.setAge(3);
        busta.printDogAge();

        Patient olya = new Patient();
        olya.setName("Olya");
        olya.setLastName("M");
        olya.setNumber(100);
        olya.setProblems("back", "neck", "sugar level");
        olya.needsHelp();


    }
}
