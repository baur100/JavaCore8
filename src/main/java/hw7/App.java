package hw7;

public class App {
    public static void main(String[] args) {
        AnimalHome dog=new AnimalHome();
        dog.name = "Sharly";
        dog.sex = "girl";
        dog.breed = "Asian Shepherd";
        dog.color = "white and brown";
        dog.born = 2000;
        dog.dogName();
        dog.dogSex();
        dog.dogBorn();
        dog.dogBreed();
        dog.dogColor();
        System.out.println("*****************");
        Vehicle myCar = new Vehicle();
        myCar.brand = "BMW";
        myCar.model = "999";
        myCar.color = "Black";
        myCar.year = 2020;
        myCar.myCarBrand();
        myCar.myCarModel();
        myCar.myCarColor();
        myCar.myCarAge();
        System.out.println("*****************");
        Vehicle carMine = new Vehicle();
        carMine.year = 2020;
        carMine.model = "460";
        carMine.brand = "Lexus";
        carMine.color = "Gray";
        System.out.println("*****************");
        carMine.myCarBrand();
        carMine.myCarModel();
        carMine.myCarColor();
        carMine.myCarAge();
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
