package homework11;

public class WorkCar extends RegularCar {
    private String toolBox;
    private int seats;

    public WorkCar(String make, String color, int tyresize, CarType carType, EngineType engineType, int year, String salon, String toolBox, int seats) {
        super(make, color, tyresize, carType, engineType, year, salon);
        this.toolBox = toolBox;
        this.seats = seats;
    }

    public WorkCar() {

    }


    public String getToolBox() {
        return toolBox;
    }

    public void setToolBox(String toolBox) {
        this.toolBox = toolBox;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "WorkCar{" +
                "toolBox='" + toolBox + '\'' +
                ", seats=" + seats +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", tyresize=" + tyresize +
                ", carType=" + carType +
                ", engineType=" + engineType +
                ", year=" + year +
                '}';
    }
}
