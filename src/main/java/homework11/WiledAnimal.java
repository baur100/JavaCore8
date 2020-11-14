package homework11;

public class WiledAnimal extends Animal{
    private String location;

    public WiledAnimal(String name,String kind,int year,Color color, String location){
        super(name, kind, year, color);
        this.location=location;
    }
    public WiledAnimal(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void printAnimalLocation() {
        System.out.println(name + " " + kind + " is living at the " +location);
    }
}
