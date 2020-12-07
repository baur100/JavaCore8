package lesson12and13Homework;

public class App {
    public static void main(String[] args) {
        PublicPool cityPool = new PublicPool("50 meters", "25 meters");
        cityPool.poolInfo();

        GymPool localGymPool = new GymPool("30 meters", "15 meters");
        localGymPool.poolInfo();


    }
}
