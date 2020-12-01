package homework15;

public class Usage {
private String sport;
private String climate;

public  Usage(){
    }
    public Usage(String sport,String climate){
    this.sport=sport;
    this.climate=climate;
    }
    public String getSport(){
    return sport;
    }
    public void setSport(){
    this.sport=sport;
    }
    public  String getClimate(){
    return climate;
    }
    public void setClimate(){
    this.climate=climate;
    }

    @Override
    public String toString() {
        return "Usage{" +
                "sport='" + sport + '\'' +
                ", climate='" + climate + '\'' +
                '}';
    }
}
