package homework9;

import java.sql.SQLOutput;

public class Phone {
    private String brand;
    private String model;
    private int year;

    public Phone(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;

    }
    public Phone(){}

     public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        if (year < 2004 || year > 2020) {
            throw new IllegalArgumentException("Wrong year");
        }

        this.year = year;
    }
        public void printClass(){
            System.out.println("Phone{"+"brand="+brand+",model="+model+",year="+year+"}");
        }

}
