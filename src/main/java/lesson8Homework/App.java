package lesson8Homework;

public class App {
    public static void main(String[] args) {
        Artist mostPopularArtist = new Artist();
        mostPopularArtist.artistName = "John";
        mostPopularArtist.songName = "Best Track";
        mostPopularArtist.numberOfPlays = 10000;
        mostPopularArtist.play();

        Artist myFavoriteArtist = new Artist();
        myFavoriteArtist.artistName = "Tom";
        myFavoriteArtist.songName = "Slow Track";
        myFavoriteArtist.numberOfPlays = 2000;
        myFavoriteArtist.play();

        Team firstTeam = new Team();
        firstTeam.name = "Blue Team";
        firstTeam.score = 20.5;
        firstTeam.win("a TV set");

        Team secondTeam = new Team();
        secondTeam.name = "Red Team";
        secondTeam.score = 14.3;
        secondTeam.win("a phone");

        Employee manager = new Employee();
        manager.firstName = "John";
        manager.lastName = "Smith";
        manager.salary = 80000;
        manager.salaryRaise(100000);

        Employee junior = new Employee();
        junior.firstName = "Kate";
        junior.lastName = "Brown";
        junior.salary = 40000;
        junior.salaryRaise(60000);

    }
}
