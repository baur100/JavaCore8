package homework11;

public class OutdoorCar extends WorkCar{
    private String tools;
    private String cover;

    public OutdoorCar(String make, String color, int tyresize, CarType carType, EngineType engineType, int year, String salon, String toolBox, int seats, String tools, String cover) {
        super(make, color, tyresize, carType, engineType, year, salon, toolBox, seats);
        this.tools = tools;
        this.cover = cover;
    }

    public OutdoorCar(){

    }
    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "OutdoorCar{" +
                "tools='" + tools + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }
}
