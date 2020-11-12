package hw8;

public class App {
    public static void main(String[] args) {
        Student jill = new Student();
        jill.name = "Jill";
        jill.study = "Cambridge University";
        jill.GoldMedal = "GoldMedal";
        jill.setName();
        jill.JillGetMedal();
        jill.JillStudy();
        System.out.println("*****************");
        Teacher baur = new Teacher();
        baur.name = "Baur";
        baur.use = "Window10";
        baur.teach = "Automation";
        baur.Automation="three month";
        baur.month = "3+";
        baur.BaurName();
        baur.BaurAutomation();
        baur.Month();
        System.out.println("*****************");
        Person kairat = new Person();
        kairat.name = "Kairat";
        kairat.play = "Soccer";
        kairat.clubName = "PSC";
        kairat.position = "Leader";
        kairat.age = "6";
        kairat.KairatName();
        kairat.KairatPlay();
        kairat.KairatClubName();
        kairat.KairatPosition();
        kairat.KairatAge();
    }
}
