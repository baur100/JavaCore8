package models;

public class Artist {
    private String name;
    private int id;
    private String image;

    public Artist(String name, int id, String image) {
        this.name = name;
        this.id = id;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }
}
