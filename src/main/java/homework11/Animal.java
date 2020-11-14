package homework11;

public class Animal {
    protected String name;
    protected String kind;
    protected int year;
    protected Color color;

    public Animal(String name,String kind,int year,Color color){
        this.name=name;
        this.kind=kind;
        this.year=year;
        this.color=color;
    }
    public Animal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void printAnimalColor(){
        System.out.println(name+" "+kind+" is "+color+" color");
    }
}
