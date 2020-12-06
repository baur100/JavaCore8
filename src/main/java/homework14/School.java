package homework14;

public class School {
    private String name;
    private String type;
    private Integer year;

    public School(String name, String type, Integer year) {
        this.name = name;
        this.type = type;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
