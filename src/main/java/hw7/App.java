package hw7;

public class App {
    public static void main(String[] args) {
        AnimalHome dog=new AnimalHome();
        dog.color = "white and brown";
        dog.breed = "Asian Shepherd";
        dog.sex = "male";
        dog.name = "Sharly";
        dog.born = 2000;
        dog.dogName();
        dog.dogBorn();
        dog.dogBreed();
        dog.dogColor();
        dog.dogSex();
        System.out.println("*****************");
        Vehicle myCar = new Vehicle();
        myCar.brand = "BMW";
        myCar.color = "Black";
        myCar.model = "999";
        myCar.year = 2010;
        myCar.myCarModel();
        myCar.myCarColor();
        myCar.myCarBrand();
        myCar.myCarAge();
        System.out.println("*****************");
        Vehicle carMine = new Vehicle();
        carMine.year = 2000;
        carMine.model = "9";
        carMine.brand = "Lada";
        carMine.color = "Pink";
        carMine.myCarAge();
        carMine.myCarBrand();
        carMine.myCarColor();
        carMine.myCarModel();
        System.out.println("*****************");
        Person San=new Person();
        San.name="San";
        San.national="China";
        San.sex="Male";
        San.year=1988;
        San.canRun();
        San.canEat();
    }

}
