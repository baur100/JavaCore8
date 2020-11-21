package lesson8Homework;

public class Employee {
    public String firstName;
    public String lastName;
    public int salary;
    public void salaryRaise(int newSalary){
        System.out.println("Employee " +firstName+ " " +lastName + " got a raise from "+ salary+ " to " + newSalary);
    }
}
