package homework10;

public class Fruit {
    private String name;
    private String color;
    private Shape shape;

    public Fruit(String name, String color, Shape shape) {
        this.name = name;
        this.color = color;
        this.shape = shape;
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

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", shape=" + shape +
                '}';
    }
}

