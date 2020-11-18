package homework14;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Patient {
    private String name;
    private int id;
    private List<Problems> problems;

    public Patient(String name, int id, List<Problems> problems) {
        this.name = name;
        this.id = id;
        this.problems = problems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printProblems(List<Problems> problems) {
        for (Problems p : problems)
            System.out.println(p+" , ");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", id=" + id;
    }
}
