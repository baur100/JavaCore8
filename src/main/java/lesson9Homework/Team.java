package lesson9Homework;

public class Team {
    private String name;
    private String prize;
    private int[] score;

    //default constructor
    public Team(){}

    //full constructor
    public Team(String name, String prize, int[] score){
        this.name = name;
        this.prize = prize;
        this.score = score;
    }
// setters and getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrize(String prize){
        this.prize = prize;
    }
    public String getPrize(){
        return prize;
    }
    public void setScore(int[] score){
        this.score = score;
    }
    public int[] getScore(){
        return score;
    }
// print all info
    public void printAllScores(){
        for(int v: score){
            System.out.println(v);
        }
    }
    public void printClass(){
        System.out.println("Team name: "+name+", prize won: "+prize+ ", all team scores: ");
        printAllScores();

    }


}
