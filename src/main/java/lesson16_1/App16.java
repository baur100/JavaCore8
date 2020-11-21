package lesson16_1;

public class App16 {
    public static void main(String[] args) {
        Person16 xx = new Person16(25);



        try{
            xx.setAge(-20);
        } catch (IllegalArgumentException err){
            System.out.println("negative age entered = changed to zero");
            xx.setAge(0);
        }
        System.out.println(xx.getAge());

    }

}
