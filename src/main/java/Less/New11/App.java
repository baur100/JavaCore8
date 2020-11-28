package Less.New11;

import javax.security.auth.Subject;

public class App {
    public static void main(String[] args) {
      Address mariaAddress = new Address("Tom Castain1", "Tom Castain2","Charlotte", "N.Carolina", 28226);
        Student Mariastudent = new Student("Maria", "Cebotari", 1994, mariaAddress, Subjects.Math, "350",(short)2);

      Address juliaAddress = new Address("Iurii Gararin","Tom Castain2", "Charlotte","North Carolina",29292);
        Teacher julia = new Teacher("Julia", "Buga",1990, juliaAddress, Subjects.Biology);

        System.out.println(julia.getAddress().getStreetAdd2());

    }
}
