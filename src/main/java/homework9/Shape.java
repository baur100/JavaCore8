package homework9;

public class Shape {
    private String name;
    private String color;
    private String[] place;


    public Shape (String name, String color, String[] place ){
        this.name= name;
        this.color= color;
        this.place = place


    }
    public String getName(){return name;}
    public void setName(String mame){this.name=name;}

    public String getColor(){return color;}
    public void  setColor(String color){this.color = color;}

    public String[] getPlace(){return place;}
    public void setPlace(String[] place){this.place = place;}


    public void printplace(){
        for (String v: this.place){
            System.out.println(v);
        }
    }
    public void printClass(){System.out.println(this.name + " "+ this.color  + " ");}

}


