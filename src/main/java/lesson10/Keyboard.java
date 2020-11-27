package Lesson10;

public class Keyboard {
    private String USB;
    private String Wireless;
    private String Ergonomic;

    public Keyboard(String USB, String wireless, String ergonomic) {
        this.USB = USB;
        Wireless = wireless;
        Ergonomic = ergonomic;
    }

    public String getUSB() {
        return USB;
    }

    public void setUSB(String USB) {
        this.USB = USB;
    }

    public String getWireless() {
        return Wireless;
    }

    public void setWireless(String wireless) {
        Wireless = wireless;
    }

    public String getErgonomic() {
        return Ergonomic;
    }

    public void setErgonomic(String ergonomic) {
        Ergonomic = ergonomic;
    }
}
