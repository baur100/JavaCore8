package homework9;

public class Friend {
    private String name;
    private String lastName;
    private int[] year;



    public Friend (String name, String lastName, int[] year ){
        this.name= name;
        this.lastName= lastName;
        this.year = year;




    }
    public String getName(){return name;}
    public void setName(String mame){this.name=name;}

    public String getLastName(){return lastName;}
    public void  setLastName(String lastName){this.lastName = lastName;}

    public int[]  getYear(){return year;}
    public void setYear(int[] year){this.year= year;}



    public void printYear(){
        for (int v: this.year){
            System.out.println(v);
        }
    }

    public void printClass(){ System.out.println(this.name + " "+ this.lastName + " is my best friend");}
}
