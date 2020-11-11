package hw9;

public class Geography {
    private String country;
    private String capital;
    private int area;
    private int population;
    private String[] religions;

    public Geography(String country, String capital, int area, int population) {
        this.country = country;
        this.capital = capital;
        this.area = area;
        this.population = population;
    }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getCapital() { return capital; }

    public void setCapital(String capital) { this.capital = capital; }

    public int getArea() { return area; }

    public void setArea(int area) { this.area = area; }

    public int getPopulation() { return population; }

    public void setPopulation(int population) { this.population = population; }

    public String[] getReligions() { return religions; }

    public void setReligions(String[] religions) { this.religions = religions; }


    public void printReligions() {
        for (String v : this.religions){
            System.out.println(v);
        }
            public void is();

            System.out.println(this.capital + "is a capital of " + this.country + ".");
        }

    }




