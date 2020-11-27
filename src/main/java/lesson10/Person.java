package Lesson10;

public class Person {
    private String name;
    private String lastname;
    private Adress adress;

    public Person(String name, String lastname, Adress adress) {
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Adress getAdress() { return adress;}

    public void setAdress(String Adress) { this.adress = adress; }

    @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", adress=" + adress +
                    '}';
        }


    }