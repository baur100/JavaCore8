package lesson11;

public class App {
    private final static int XX = 5;
    public static void main(String[] args) {
        Address davidAddress = new Address("125 Elm st", "Gotham","IL",50601);
        Student david = new Student("David","Ross",1985,davidAddress,Subjects.BIOLOGY,"MIT", (short) 5);

        Address janeAddress = new Address("135 Elm st", "Gotham","IL",50601);
        Teacher jane = new Teacher("Jane","Rakowski",1989,janeAddress,Subjects.CHEMISTRY);

        System.out.println(jane.getAddress().getStreetAddress1());

    }
}
