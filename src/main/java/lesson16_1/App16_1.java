package lesson16_1;

public class App16_1 {
    public static void main(String[] args) {
        String[] xx = {"aa", "bb"};

        try {
            int s = 5/1;
            xx[1] = "Hello";
            System.out.println("Code after error");
        } catch (ArrayIndexOutOfBoundsException ignored) {
            System.out.println("Code in Catch block");
        } catch (ArithmeticException err){
            System.out.println("In the second catch block");
        } catch (Exception err){
            System.out.println("Catch ALL Exceptions");
        } finally {
            System.out.println("Run in ANY case");
        }

        System.out.println("Code after try/catch block");
    }
}
