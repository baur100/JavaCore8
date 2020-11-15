package homework8;

public class Cat {
    public String breed;
    public String nickname;
    public String owner;
    public int age;

    public void meow (){
        System.out.println(nickname+" "+"can meow");
            }
    public void scrabble (){
        System.out.println(owner+"'s cat" + " " +nickname+ " "+"can scrabble you");
        System.out.println("++++++++++");
    }

}



//1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают