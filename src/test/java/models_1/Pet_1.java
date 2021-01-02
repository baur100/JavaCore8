package models_1;

public class Pet_1 {
    private long id;
    private Category_1 category;
    private String name;
    private String[] photoUrl;
    private Tag_1[] tags;
    private Status_1 status;

    public Pet_1(String name, String[] photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public Pet_1(Category_1 category, String name, String[] photoUrl, Tag_1[] tags, Status_1 status) {
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

    public Category_1 getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrl() {
        return photoUrl;
    }

    public Tag_1[] getTags() {
        return tags;
    }

    public Status_1 getStatus() {
        return status;
    }
}
