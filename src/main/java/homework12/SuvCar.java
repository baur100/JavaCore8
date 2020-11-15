package homework12;

public class SuvCar implements Car{
   private String brand;
   private String model;
   private String color;

   public SuvCar(String brand,String model, String color){
       this.brand=brand;
       this.model=model;
       this.color=color;
   }
   public void travel(){
       System.out.println(color+" "+brand+" "+model+" is traveling");
   }
    @Override
    public void drive() {
        System.out.println("I can drive");

    }
}
