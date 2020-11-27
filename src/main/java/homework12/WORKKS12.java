package homework12;

public class WORKKS12 {
    public static void main(String[] args) {
        NewLocalCar oneTime=new NewLocalCar("Toyota","Supra","RED","CAS");
        oneTime.GasOrDiesel();
        oneTime.OctanFuel();
        oneTime.BackUpOption();
        NewLocalCar next=new NewLocalCar("Indi","!@@","Blue","Diesel");
        next.GasOrDiesel();
        next.BacuUpon();

        GetCar rent=new GetCar("Bentley","White");
        rent.OctanFuel();
        GetCar neo=new GetCar("Izzy","NEO");
        System.out.println(neo.getColor());

    }

}
