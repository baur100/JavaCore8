package homework11.part1;

public class Coach {
    private String name;
    private String lastName;
    private ContactInfo contactInfo;

    public Coach(String name,String lastName,ContactInfo contactInfo){
        this.name=name;
        this.lastName=lastName;
        this.contactInfo=contactInfo;
    }
    public Coach(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

}
