package homework11;

public class RegularCar extends Cars {
    private String salon;


    public RegularCar(String make, String color, int tyresize, CarType carType, EngineType engineType, int year, String salon) {
        super(make, color, tyresize, carType, engineType, year);
        this.salon = salon;
    }

    public RegularCar() {

    }

    public RegularCar(String salon) {
        this.salon = salon;
    }

//    public RegularCar(Cars car1, String leather) {
//}


    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "RegularCar{" +
                "salon='" + salon + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", tyresize=" + tyresize +
                ", carType=" + carType +
                ", engineType=" + engineType +
                ", year=" + year +
                '}';
    }
}
