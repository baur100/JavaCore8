package lesson16;

public class App {
    public static void main(String[] args) {
        Person xx = new Person(25);

        try{
            xx.setAge(-20);
        } catch (IllegalArgumentException err){
            System.out.println("negative age entered = changed to zero");
            xx.setAge(0);
        }

        System.out.println(xx.getAge());
    }
}
