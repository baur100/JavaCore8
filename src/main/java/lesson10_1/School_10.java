package lesson10_1;

public class School_10 {
    private String name;
    private SchoolType_10 type;

    public School_10(String name, SchoolType_10 type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolType_10 getType() {
        return type;
    }

    public void setType(SchoolType_10 type) {
        this.type = type;
    }
}
