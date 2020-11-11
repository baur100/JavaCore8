package hw9;

public class Person {
    private String name;
    private String lastName;
    private int age;
//    (Setter)('name' has a privet access);ee ne vidno.nado razreshenie.
////        {pravilo incopsulation} needs to use function}
    public void setName(String n ) {
        name=n;
    }
//    (Getter)
    public String getName(){
    return name;
    }
}
