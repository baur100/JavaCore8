package lesson14;

public class App {
    public static void main(String[] args) {
        int a = 5;
        Integer a1 = 5;

        double b  = a1.doubleValue();
        Double b1 = 7.4;

        float c = 3.4f;
        Float c1 = 3.4f;

        boolean d = true;
        Boolean d1 = true;

        char x = 'x';
        Character x1 = 'x';

        int xx = 5;
        int zz = xx;
        zz = 10;
        System.out.println("xx="+xx+" zz="+zz);

        Person dina = new Person("Dina");
        Person student = dina;
        student.setName("Marat");
        System.out.println("Dina = "+dina.getName()+" Student = "+student.getName());
    }
}
