package lesson9Homework;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private String[] benefits;

//default constructor
    public Employee(){}

//full constructor:
    public Employee(String firstName, String lastName, int salary, String[] benefits){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.benefits = benefits;
    }
//getters and setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setSalary(int salary){
        if(salary<0){
            throw new ArithmeticException("Wrong salary");
            }
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public void setBenefits(String[] benefits){
        this.benefits = benefits;
    }
    public String[] getBenefits(){
        return this.benefits;
    }
    public void printBenefits(){
        for(String v: this.benefits){
            System.out.println(v);
        }
    }
    public void printClass(){
        System.out.println("Employee info: " +firstName+" "+lastName+", salary is "+salary+", benefits are:");
        printBenefits();
    }

}
