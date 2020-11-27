package homework12;

public class GetCar implements VehicleFuelType{
    private String luxcar;
    private  String color;

    public GetCar(String luxcar, String color) {
        this.luxcar = luxcar;
        this.color = color;
    }

    public GetCar() {
    }

    public String getLuxcar() {
        return luxcar;
    }

    public void setLuxcar(String luxcar) {
        this.luxcar = luxcar;
    }

    public String getColor() {
        return color;
    }



    @Override
    public void OctanFuel() {
        System.out.println(luxcar+" "+color+" Highest octane only");

    }
}
