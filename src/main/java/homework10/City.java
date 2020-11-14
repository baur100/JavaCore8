package homework10;

public class City {
    private String name;
    private String state;
    private String zone;
    private int population;

    public City(String name, String state, String zone, int population) {
        this.name = name;
        this.state = state;
        this.zone = zone;
        this.population = population;
    }

    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public void printClass(){
        System.out.println("1."+name);
        System.out.println("2."+state);
        System.out.println("3."+zone);
        System.out.println("4."+population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<0){
            throw new IllegalArgumentException("Wrong population");
        }
        this.population = population;
    }
}
