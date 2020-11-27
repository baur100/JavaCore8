package Lesson8;

public class App {
    public static void main(String[] args) {

        Person Maria = new Person("Maria","Cebotari", "26", "Moldovian");
        Maria.name = "Maria";
        Maria.lastname = "Cebotari";
        Maria.age = "26";
        Maria.nationality = "Moldovian";

        Person Vasile = new Person("Vasile", "Damian", "22", "Spanish");
        Vasile.name = "Vasile";
        Vasile.lastname = "Damian";
        Vasile.age = "22";
        Vasile.nationality = "Spanish";

        Person dina = new Person("Dina","Buga","27","Moldovian");
        dina.name = "Dina";
        dina.lastname = "Buga";
        dina.age = "27";

         dina.greet("Lindsey");
         Vasile.greet("Dina");
         System.out.println(dina.age);

        Vehicle newcar = new Vehicle("Lexus","GS 460", "2020", "Red");
        newcar.brand = "Lexus";
        newcar.model = "GS 460";
        newcar.year = "2020";
        newcar.color = "Red";

       //newcar.opendoors();
         newcar.jump();
         System.out.println(newcar.color);
    }
}
