package lesson88;
// Создайте 3 класса в которых есть аттрибуты и методы
//         2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают
public class Practice {
    public static void main(String[] args) {
        String model = "420";
        String brand = "Lexus";
        int year = 2020;
        String color = "Grey";
        String making = "Beep,Beep";
         newVehicle(model,brand,year,color,making);
         newVehicle("320","Toyota",2020,"Red","Pap - Pap");

    }
        public static void newVehicle (String model, String brand, int year, String color, String making) {
        System.out.println("Beep-Beep " + "model " +model+ " " + "brand " +brand+ " making Beep "+ " "+ year+" " +color+" " +making);
        }
    }


