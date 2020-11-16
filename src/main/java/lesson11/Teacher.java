package lesson11;

public class Teacher extends Person {
      private String name;
//    private String name;
//    private String lastName;     dry code: do not repeate urself
//    private int year;
//    private Address address;

    private Subjects subjects;

    public Teacher(String name, String lastName, int year, Address address,Subjects subject){
       super(name,lastName,year,address);
        this.name=name;
        this.lastName=lastName;
        this.year=year;
        this.address=address;
        this.subjects=subject;
    }
}
