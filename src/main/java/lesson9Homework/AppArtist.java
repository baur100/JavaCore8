package lesson9Homework;

public class AppArtist {
    public static void main(String[] args) {
        Artist popularSinger = new Artist();
        popularSinger.setName("John");
        popularSinger.setSong("Best Track");
        popularSinger.setNumberOfPlays(500000);
        popularSinger.printClass();

        Artist bestSellingArtist = new Artist("Tom", "New Song", 100000);
        bestSellingArtist.printClass();


    }
}
