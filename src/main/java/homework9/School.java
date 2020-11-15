package homework9;

public class School {
    private String name;
    private String address;
    private int groupId;
    private String[] subjects;

    public School(String name, String address, int groupId, String[] subjects) {
        this.name = name;
        this.address = address;
        this.groupId = groupId;
        this.subjects = subjects;
    }

    public School() {
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void printClass() {
        System.out.println("School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", groupId=" + groupId +
                '}');
    }

    public void printSubjects() {
        for (String v : this.subjects) {
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