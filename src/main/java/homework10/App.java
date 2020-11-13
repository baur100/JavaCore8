package homework10;

public class App {
    public static void main(String[] args) {
        Eye alenaEye=new Eye("Alena",EyeColor.GREEN);
        System.out.println(alenaEye.printInfo());

        Problems[]ivanProblems={Problems.HEAD,Problems.STOMACH};
        Patient ivan=new Patient("Ivan","Petrov",105,ivanProblems);
        System.out.println(ivan.getName());
        System.out.println(ivan.getLastName());
        System.out.println(ivan.getNumber());

        for(Problems i:ivanProblems) {
            System.out.println(i + " is his problem");
        }

    }
}
