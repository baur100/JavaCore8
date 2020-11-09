package homework9;

import java.util.Arrays;

public class Patient {
    private String name;
    private String lastName;
    private int number;
    private String[]problems;

    public Patient(String name,String lastName,int number, String[]problems){
        this.name=name;
        this.lastName=lastName;
        this.number=number;
        this.problems=problems;
    }
    public Patient(){}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public String[]getProblems(){
        return problems;
    }
    public void setProblems(String[]problems){
        this.problems=problems;
    }
    public void printProblems(){
        for(String v:this.problems){
            System.out.println(v);
        }
    }
    public void needsHelp(){
        System.out.println(this.name+" "+this.lastName+" needs help"+" the problems are"+ Arrays.toString(problems));
    }
}
