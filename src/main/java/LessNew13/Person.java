package LessNew13;

public abstract class Person {
    protected String name;
    protected String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public abstract void getPersonInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
