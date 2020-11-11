package hw9;

public class Music {
    private String name;
    private String composer;
    private int year;

    public Music(String n, String c, int y){
        this.name = n;
        this.composer = c;
        this.year= y;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void printInfo(){
        System.out.println( "Music{" +
                "name='" + name +'\''+
                ", composer='" + composer +'\''+
                ", year='" + year +'\''+
                '}');
    }
}
