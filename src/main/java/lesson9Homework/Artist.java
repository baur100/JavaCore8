package lesson9Homework;

public class Artist {
    private String name;
    private String song;
    private int numberOfPlays;

    ///default constructor
    public Artist() {}

    ///full constructor
    public Artist(String name, String song, int numberOfPlays){
        this.name = name;
        this.song = song;
        this.numberOfPlays = numberOfPlays;
    }
/// getters and setters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSong(String song){
        this.song = song;
    }
    public String getSong(){
        return song;
    }
    public void setNumberOfPlays(int numberOfPlays){
        this.numberOfPlays = numberOfPlays;
    }
    public int getNumberOfPlays(){
        return numberOfPlays;
    }
    public void printClass(){
        System.out.println("Song "+song+ " by artist " +name+ " has "+numberOfPlays+ " plays");
    }



}


