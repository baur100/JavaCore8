package hw16;

public class App {
    public static void main(String[] args) {
        Person xx = new Person(20);

        try{

        xx.setAge(-20);


    } catch (IllegalArgumentException err){
            System.out.println("Negative Age");

            xx.setAge(20);
        }
        System.out.println(xx.getAge());

        String[]a = {"b","c"};
        try{
            int s = 5/0;
            a[5] = "hi";
            System.out.println("Code after error");

        }catch (ArrayIndexOutOfBoundsException ignored){
            System.out.println("Code in Catch block");

        }
        catch (ArithmeticException err){
            System.out.println("In the second catch block");
        } finally {
            System.out.println("Run in any case");
        }

        System.out.println("Code After try/catch block");
}
    }
