package lesson9Homework;

public class AppTeam {
    public static void main(String[] args) {
        Team firstTeam = new Team();
        firstTeam.setName("Red");
        firstTeam.setPrize("TV set");
        int[] firstTeamScore = {12, 15, 17, 20};
        firstTeam.setScore(firstTeamScore);
        firstTeam.printClass();

        int[] secondTeamScore = {13, 16, 19, 21};
        Team secondTeam = new Team("Blue", "Smartphone", secondTeamScore);
        secondTeam.printClass();


    }
}
