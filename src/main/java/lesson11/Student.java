package lesson11;

public class Student extends Person{
    private String lastName;
    private String name;
    private int year;
    private Address address;
//    private String name;
//    private String lastName;  dry principle do not repeate yourself
//    private int year;              extends=расширять
//    private Address address;

//     extends=расширять
    private Subjects subject;
    private String major;
    private short term;

    public Student(String name, String lastName, int year, Address address, Subjects biology, String major, short term){
        super(name,lastName,year,address);
//                super=вызывает конструктор родительского класса
        this.name=name;
        this.lastName=lastName;
        this.year=year;
        this.address=address;
    }

    public String getName() {
        return name;
    }

   public void setName(String name) {
        this.name = name;
    }

   public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

   public void setYear(int year) {
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

  public Subjects getSubjects() {
        return subject;
    }

    public void setSubjects(Subjects subjects) {
        this.subject = subjects;
    }

    public String getMajor() {
        return major;
    }

    public void setCollege(String major) {
        this.major = major;
    }

  public short getTerm() {
        return term;
    }

   public void setTerm(short term) {
        this.term = term;
    }
}
