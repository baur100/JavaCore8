package Lesson10;

public class App1 {

    public static void main(String[] args) {

       City[] IonCity = {City.Charlestone,City.Charlotte, City.Columbus};
       Person Ion = new Person("Ion","Cebotari",Adress.Adress);

        System.out.println(Ion);
        System.out.println(IonCity[1]);

    }
   @Override
     public String toString(){
        return"App1{}";
    }
}