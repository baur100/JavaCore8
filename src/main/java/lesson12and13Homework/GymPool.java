package lesson12and13Homework;

public class GymPool implements StandardPoolWaterTemp {
    private String length;
    private String width;

    public GymPool(String length, String width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void WinterTemp() {
        System.out.println("Winter water temperature is set at the request of clients");
    }

    @Override
    public void SummerTemp() {
        System.out.println("Summer water temperature is set at the request of clients");

    }
    public void poolInfo(){
        System.out.println("Gym pool info: length is " +length+ ", width is " +width);
        WinterTemp();
        SummerTemp();
    }
}
