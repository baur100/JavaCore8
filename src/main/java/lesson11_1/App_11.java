package lesson11_1;

public class App_11 {
    private final static int XX = 5;
    public static void main(String[] args) {
        Address_11 davidAddress = new Address_11("125 Elm st", "Gotham","IL",50601);
        Student_11 david = new Student_11("David","Ross",1985,davidAddress,Subjects_11.BIOLOGY,"MIT", (short) 5);

        Address_11 janeAddress = new Address_11("135 Elm st", "Gotham","IL",50601);
        Teacher_11 jane = new Teacher_11("Jane","Rakowski",1989,janeAddress,Subjects_11.CHEMISTRY);

        System.out.println(jane.getAddress.getStreetAddress1());

    }
}
