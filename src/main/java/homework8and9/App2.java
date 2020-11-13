package homework8and9;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class App2 {
    public static void main(String[] args) {
        String[] joeSubjects = {"Math", "Biology", "history"};
        Person joe = new Person("Joe", "Green", 18, joeSubjects);
        Person anna = new Person("Anna");
        anna.setLastName("Brigs");
        anna.setAge(29);



//        joe.setName("Joe");
//        System.out.println(joe.getName());
//
//        joe.setLastName("Green");
//        System.out.println(joe.getLastName());
//
//        joe.setAge(18);
//        System.out.println(joe.getAge());

//        ___________________________________________
        Phones iphone = new Phones();
        iphone.setMake("Iphone");
        iphone.setModel("6");
        iphone.setOsVersion(12.1);
        iphone.setYear(2015);
        System.out.println(iphone.getMake());
        System.out.println(iphone.getModel());
        System.out.println(iphone.getOsVersion());
        System.out.println(iphone.getYear());
//        ________________________________________________

        Country usa = new Country();
        usa.setName("USA");
        usa.setContinent("North America");
        usa.setPopulatin(320000000);
        System.out.println(usa.getPopulatin());

//        ___________________________________________________
        iphone.printInfo();
        joe.printInfo();
        usa.printInfo();

        joe.printSubjects();
    }
}
