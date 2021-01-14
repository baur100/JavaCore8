package modelsNK;

public class PetNK {
    private long id;
    private CategoryNK category;
    private String name;
    private String[] photoUrl;
    private TagNK[] tags;
    private StatusNK status;

    public PetNK(String name, String[] photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public PetNK(CategoryNK category, String name, String[] photoUrl, TagNK[] tags, StatusNK status) {
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

    public CategoryNK getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrl() {
        return photoUrl;
    }

    public TagNK[] getTags() {
        return tags;
    }

    public StatusNK getStatus() {
        return status;
    }
}
