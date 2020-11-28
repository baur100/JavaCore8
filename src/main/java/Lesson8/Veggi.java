package Lesson8;

public class Veggi {
    public String name;
    public String color;
    public String taste;
    public String size;

    public Veggi(String name, String color, String taste, String size) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
