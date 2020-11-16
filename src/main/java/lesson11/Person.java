package lesson11;

public class Person {
    private String lastname;
    protected String lastName;
    protected int year;
    protected Address address;
    private String name;
//   private String lastname;
//   private int year;
//   private Address address;

   public Person(String name,String lastname,int year,Address address){
       this.name=name;
       this.lastname=lastname;
       this.year=year;
       this.address=address;
   }
}
