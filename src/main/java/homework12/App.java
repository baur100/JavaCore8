package homework12;

public class App {
    public static void main(String[] args) {
        NewModel Kate = new NewModel(" Female", "russian", "FordModel");
        Kate.BustModelStandart();
        Kate.WaistModelStandart();
        Kate.hipscmModelStandart();

        Kate.modelPose();
        Kate.modelWalk();


        Dietetics FiveDays = new Dietetics(" Mary","female", "in a two month", 6);
        FiveDays.hipscmModelStandart();
        FiveDays.WaistModelStandart();

        FiveDays.lostWeight();
    }


}
