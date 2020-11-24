package homework11;

public class Owner extends Company {
    private int experience;


    public Owner(Name name, int year, Address address, Field field, int experience) {
        super(name, year, address, field);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "experience=" + experience +
                ", name=" + name +
                ", year=" + year +
                ", address=" + address +
                ", field=" + field +
                '}';
    }
}

