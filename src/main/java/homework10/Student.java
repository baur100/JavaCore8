package homework10;

public class Student {
    private String name;
    private String lastName;
    private String degree;
    private int yearOfStudy;


    public Student(String n, String l, String d, int y){
        this.name=n;
        this.lastName=l;
        this.degree=d;
        this.yearOfStudy=y;
    }
    public Student(String lastName,int yearOfStudy){
        this.lastName=lastName;
        this.yearOfStudy=yearOfStudy;
    }

    public void printClass(){
        System.out.println("1."+name);
        System.out.println("2."+lastName);
        System.out.println("3."+degree);
        System.out.println("4."+yearOfStudy);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDegree(String degree){
        this.degree=degree;
    }
    public String getDegree(){
        return degree;
    }
    public void setYearOfStudy(int yearOfStudy){
        if (yearOfStudy<1 || yearOfStudy>6){
            throw new IllegalArgumentException("Year of study should be 1 to 6");
        }
        this.yearOfStudy=yearOfStudy;
    }
    public int getYearOfStudy(){
        return yearOfStudy;
    }
}
