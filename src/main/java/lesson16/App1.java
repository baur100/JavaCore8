package lesson16;

public class App1 {
    public static void main(String[] args) {
        String[]xx = {"aa","bb"};

        try{
           int s = 5/1;
           xx[1]="Hello";
           Person dd = new Person(5);
           System.out.println("Code after error");
        } catch (ArrayIndexOutOfBoundsException ignored){
            System.out.println("Code in Catch block");
        } catch (ArithmeticException err){
            System.out.println("In the second catch block");
        } catch (Exception err){
            System.out.println("Catch ALL Exceptions");
        } finally {
            System.out.println("Run in ANY case");
        }

        System.out.println("Code After try/catch block");
    }
}
