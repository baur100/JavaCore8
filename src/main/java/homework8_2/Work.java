package homework8_2;

public class Work {
    public static void main(String[] args) {

        Bags chanel = new Bags("Chanel", "black");
        Bags myBag = new Bags();
        myBag.setBrand("Chanel1");
        myBag.setColor("black1");
        chanel.printInfo();
        myBag.printInfo();
        chanel.setColor("Red");
        chanel.printInfo();

        System.out.println(chanel.getBrand());
        System.out.println(chanel.getColor());

        Child misha = new Child("Misha", "Nifantev", 10);
        Child mila = new Child();
        misha.setName("Misha");
        misha.setLastName("Nifantev");
        misha.setAge(10);

        Jobs qualityAssur = new Jobs("Quality Assurance", "Triboro", 2020);
        Jobs projectMen = new Jobs();
        qualityAssur.setName("Quality Assurance");
        qualityAssur.setNameOrganization("Triboro");
        qualityAssur.setYear(2020);





    }
}
