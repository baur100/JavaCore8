package homework8and9;

public class Phones {
    private String make;
    private String model;
    private double osVersion;
    private int year;

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setOsVersion(double osVersion){
        this.osVersion = osVersion;
    }
    public double getOsVersion(){
        return osVersion;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void printInfo(){
        System.out.println("Phone info: "+make+" "+model+" "+osVersion+" "+year);
    }

}
