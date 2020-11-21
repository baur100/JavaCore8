package lesson8Homework;

public class Artist {
    public String artistName;
    public String songName;
    public int numberOfPlays;

    public void play(){
        System.out.println("Song "+songName + " by "+ artistName + " was played " + numberOfPlays + " times");
    }

}
