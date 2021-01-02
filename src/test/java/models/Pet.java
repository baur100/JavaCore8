package models;

public class Pet {
    private long id;
    private Category category;
    private String name;
    private String[] photoUrl;
    private Tag[] tags;
    private Status status;

    public Pet(String name, String[] photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public Pet(Category category, String name, String[] photoUrl, Tag[] tags, Status status) {
        this.category = category;
        this.name = name;
        this.photoUrl = photoUrl;
        this.tags = tags;
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrl() {
        return photoUrl;
    }

    public Tag[] getTags() {
        return tags;
    }

    public Status getStatus() {
        return status;
    }
}
