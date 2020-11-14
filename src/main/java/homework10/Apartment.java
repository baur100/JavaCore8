package homework10;

public class Apartment {
    private String floorPlan;
    private int beds;
    private int baths;
    private int square;
    private String building;

    public Apartment(String floorPlan, int beds, int baths, int square, String building){
        this.floorPlan=floorPlan;
        this.beds=beds;
        this.baths=baths;
        this.square=square;
        this.building=building;
    }
    public Apartment(int beds, int baths, int square){
        this.beds=beds;
        this.baths=baths;
        this.square=square;
    }
    public void printClass(){
        System.out.println("1."+floorPlan);
        System.out.println("2."+beds);
        System.out.println("3."+baths);
        System.out.println("4."+square);
        System.out.println("5."+building);
    }
    public String getFloorPlan(){
        return floorPlan;
    }
    public void setFloorPlan(String floorPlan){
        this.floorPlan=floorPlan;
    }
    public int getBeds(){
        return beds;
    }

    public void setBeds(int beds) {
        if (beds<0){
            throw new IllegalArgumentException("Cannot be less than 0");
        }
        this.beds = beds;
    }
    public int getBaths(){
        return baths;
    }

    public void setBaths(int baths) {
        if(baths<1){
            throw new IllegalArgumentException("Cannot be less than 1");
        }
        this.baths = baths;
    }
    public int getSquare(){
        return square;
    }
    public void setSquare(int square){
        if(square<1){
            throw new IllegalArgumentException("Cannot be less than 1");
        }
        this.square=square;
    }
    public String getBuilding(){
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
