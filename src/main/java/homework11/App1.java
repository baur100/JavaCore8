package homework11;

public class App1 {
    public static void main(String[] args) {
        Address nadyaAddress=new Address("123 Edy",23,33304);
        ContactInfo nadyaContactInfo=new ContactInfo("89026347151","nadya.kolt@gmail.com",nadyaAddress);
        Coach nadya=new Coach("Nadya","K",nadyaContactInfo);

        System.out.println(nadya.getContactInfo().getAddress().getStreetAddress1());

    }
}
