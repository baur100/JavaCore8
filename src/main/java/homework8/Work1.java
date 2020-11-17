package homework8;

public class Work1 {
    public static void main(String[] args) {

        Person oleg = new Person();
        oleg.name = "Oleg";
        oleg.lastName = "Ivanov";
        oleg.age = 25;
        System.out.println(oleg.age);

        Person lena = new Person();
        lena.lastName = "Braun";
        lena.age = 33;
        System.out.println(lena.age + " " + lena.lastName);

        Vehicle myCar = new Vehicle();
        myCar.brand = "BMW";
        myCar.year = 2020;
        System.out.println(myCar.brand + " " + myCar.year);

        Vehicle husbandCar = new Vehicle();
        husbandCar.brand = "Infinity";
        husbandCar.color = "black";
        System.out.println(husbandCar.brand + " " + husbandCar.color);

        Phone myPhone = new Phone();
        myPhone.brand = "Apple";
        myPhone.year = 2019;
        System.out.println(myPhone.brand + " " + myPhone.year);

        Phone husbandPhone = new Phone();
        husbandPhone.brand = "Samsung";
        husbandPhone.year = 2019;
        System.out.println(husbandPhone.brand);



    }
}
