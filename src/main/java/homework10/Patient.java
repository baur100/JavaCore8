package homework10;

public class Patient {
    private String name;
    private String lastName;
    private int number;
    private Problems[]problems;

    public Patient(String name,String lastName,int number,Problems[]problems){
        this.name=name;
        this.lastName=lastName;
        this.number=number;
        this.problems=problems;
//        Do I need to write all Set and Gets here?
    }
}
