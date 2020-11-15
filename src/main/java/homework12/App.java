package homework12;

public class App {
    public static void main(String[] args) {
        ConstructionCar car1=new ConstructionCar("X10","Cat");
        car1.drive();
        car1.work();

        SuvCar car2=new SuvCar("Toyota","RAV4","Silver");
        car2.drive();
        car2.travel();
    }
}
