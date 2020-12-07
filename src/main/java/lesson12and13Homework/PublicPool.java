package lesson12and13Homework;

public class PublicPool implements StandardPoolWaterTemp {
    private String length;
    private String width;

    public PublicPool(String length, String width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void WinterTemp() {
        System.out.println("Winter water temperature is kept at 29C");

    }

    @Override
    public void SummerTemp() {
        System.out.println("Summer water temperature is kept at 25C");

    }

    public void poolInfo(){
        System.out.println("Public pool info: length is "+length+ ", width is "+width);
        WinterTemp();
        SummerTemp();
    }
}
