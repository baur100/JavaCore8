package homework10;

import java.util.Arrays;

public class Patient {
    private String name;
    private String lastName;
    private int number;
    private Problems[]problems;

    public Patient(){}

    public Patient(String name,String lastName,int number,Problems[]problems){
        this.name=name;
        this.lastName=lastName;
        this.number=number;
        this.problems=problems;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Problems[] getProblems() {
        return problems;
    }

    public void setProblems(Problems[] problems) {
        this.problems = problems;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", problems=" + Arrays.toString(problems) +
                '}';
    }
}
