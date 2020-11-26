package homework10;


import java.awt.*;
import java.util.Arrays;

public class Keyboard {
    private Colors[] color;
    private ConnectionTypeMouse connectionTypeMouse;

    public Keyboard(Colors[] color, ConnectionTypeMouse connectionTypeMouse) {
        this.color = color;
        this.connectionTypeMouse = connectionTypeMouse;
    }

    public Keyboard(ConnectionTypeMouse connectionTypeMouse, Colors[] color) {
        this.connectionTypeMouse = connectionTypeMouse;
        this.color = color;

    }


    public Keyboard() {
    }

    public Colors[] getColor() {
        return color;
    }

    public void setColor(Colors[] color) {
        this.color = color;
    }

    public ConnectionTypeMouse getConnectionTypeMouse() {
        return connectionTypeMouse;
    }

    public void setConnectionTypeMouse(ConnectionTypeMouse connectionTypeMouse) {
        this.connectionTypeMouse = connectionTypeMouse;
    }


    @Override
    public String toString() {
        return "Keyboard{" +
                "color=" + Arrays.toString(color) +
                ", connectionType=" + connectionTypeMouse +
                '}';
    }


    public String toString1() {
        return "Keyboard{ " +
                "connectionTypeMouse=" + connectionTypeMouse +
                ", color=" + Arrays.toString(color) +
                '}';
    }

}
