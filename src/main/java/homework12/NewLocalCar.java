package homework12;

import jdk.swing.interop.SwingInterOpUtils;

public class NewLocalCar implements VehicleFuelType,EngineType{
    private String make;
    private String model;
    private String color;
    private String engine;

    public NewLocalCar(String make, String model, String color, String engine) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public void BacuUpon() {
        System.out.println(make+" " + model + " camera loaded");
    }

        public void BackUpOption(){
        System.out.println(make+" "+model+" camera as option");
    }


    @Override
    public void OctanFuel() {
        System.out.println("Use Gas station");

    }

    @Override
    public void GasOrDiesel() {
        System.out.println("No electric ehgines");

    }
}
