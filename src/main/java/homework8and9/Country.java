package homework8and9;

public class Country {
    private String name;
    private String continent;
    private int populatin;

    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setContinent(String continent){
        this.continent = continent;
    }
    public String getContinent(){
        return continent;
    }
    public void setPopulatin(int populatin){
        if(populatin<=0 || populatin> 2000000000){
            throw new ArithmeticException("Wrong number of peaople entered");
        }
        this.populatin = populatin;
    }
    public int getPopulatin(){
        return populatin;
    }
    public void printInfo(){
        System.out.println("Country info: "+name+" "+continent+" "+populatin);
    }
}
