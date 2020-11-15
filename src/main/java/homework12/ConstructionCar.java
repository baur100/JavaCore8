package homework12;

public class ConstructionCar implements Car{
    private  String model;
    private String brand;

    public ConstructionCar(String model,String brand){
        this.model=model;
        this.brand=brand;
    }
    public void work() {
        System.out.println(brand + " " + model + " is working");
    }
    @Override
    public void drive() {
        System.out.println("I can drive");

    }
}
