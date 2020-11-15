package homework12;

public class App {
    public static void main(String[] args) {
        ConstructionCar car1=new ConstructionCar("X10","Cat");
        car1.drive();
        car1.work();

        ConstructionCar car01=new ConstructionCar("C130","CASE");
        car01.drive();
        car01.work();

        SuvCar car2=new SuvCar("Toyota","RAV4","Silver");
        car2.drive();
        car2.travel();

        SuvCar car02=new SuvCar("BMW","X5","White");
        car02.drive();
        car02.travel();
    }
}
