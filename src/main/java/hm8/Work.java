package hm8;

public class Work {
    public static void main(String[] args) {
        Person Amina = new Person();
        Amina.name = "Amina";
        Amina.lastName = "Astanova";
        Amina.age = 25;
        Amina.job = "Doctor";

        Person james = new Person();
        james.name = "James";
        james.lastName = "Johnson";
        james.age = 45;
        james.job = "Lawyer";

        Person Kamala = new Person();
        Kamala.name = "Kamala";
        Kamala.lastName = "Davidson";
        Kamala.age = 33;
        Kamala.job = "Journalist";

        System.out.println(Amina.job);

        Book  romeoandjuliet = new Book();
        romeoandjuliet.kind = "Tragedy";
        romeoandjuliet.author = "William Shakespeare";
        romeoandjuliet.year = 1594;
        romeoandjuliet.page = 480;

        System.out.println(romeoandjuliet.author);

        Painting MonaLisa = new Painting();
        MonaLisa.kind = "Portrait";
        MonaLisa.artist = "Leonardo da Vinchi";
        MonaLisa.year = 1503-1506;

        System.out.println(MonaLisa.kind);

        romeoandjuliet.is();
        MonaLisa.is();
        Amina.printInfo();


    }
}
