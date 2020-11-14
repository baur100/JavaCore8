package homework8;

public class OwnApp {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.brand="Samsung";
        myPhone.model="Note10";
        myPhone.memoryStorage=512;

        myPhone.getPhoneInfo();
    }
}
