package Lesson10;

public class Monitore {
    private Monitore size;
    private String Resolution;
    private String screen;

    public Monitore(Monitore size, String resolution, String screen) {
        this.size = size;
        Resolution = resolution;
        this.screen = screen;
    }

    public Monitore getSize() {
        return size;
    }

    public void setSize(Monitore size) {
        this.size = size;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String resolution) {
        Resolution = resolution;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}

