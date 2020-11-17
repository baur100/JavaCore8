package strings;

import lesson11.Address;
import lesson11.Student;
import lesson11.Subjects;
import lesson11.Teacher;

public class App {
    public static void main(String[] args) {
        Address davidAddress=new Address("125 Elm st","Gotham","IL",50897);
        Student david=new Student("David","Ross",1985, davidAddress, Subjects.BIOLOGY,"MIT",(short)5);

        Address janeAddress=new Address("135 Elm st","Gotham","IL",50897);
        Teacher jane=new Teacher("Jane","Rakovski",1989,janeAddress,Subjects.CHEMISTRY);

        System.out.println(david.getAddress().getStreetAddress());
    }
//    pochemy y menyz ne pokazyvaet jane.getAddress??

}
