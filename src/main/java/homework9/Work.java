package homework9;

public class Work {
    private String name;
    private String address;
    private String occupation;
    private int experience;
    private String[] skills;

    public Work(String name, String address, String occupation, int experience, String[] skills) {
        this.name = name;
        this.address = address;
        this.occupation = occupation;
        this.experience = experience;
        this.skills = skills;
    }

    public Work(String name, String occupation, int experience) {
        this.name = name;
        this.occupation = occupation;
        this.experience = experience;
    }

    public Work() {
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public void printClass() {
        System.out.println("Work{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", occupation='" + occupation + '\'' +
                ", experience=" + experience +
                '}');
    }

    public void printSkills() {
        for (String v : this.skills) {
            System.out.println(v);
        }
    }

}


//Сделать 3 класса - в каждом классе по краней мере 3 fields
//Каждый field имеет setter и getter
//Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
//создайте в каждом классе метод printClass() - для вывода всех полей на экран

//По крайней мере один атрибут в одном классе должен быть array
//Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
//Выведите на экран эти объекты функцией printClass()