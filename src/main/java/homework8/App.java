package homework8;

public class App {
    public static void main(String[] args) {
        Cat vasya = new Cat();
        vasya.breed = "Dvoroviy";
        vasya.nickname = "Vasya";
        vasya.owner = "Katya";
        vasya.age = 2;

        vasya.meow();
        vasya.scrabble();

        Cat sonya = new Cat();
        sonya.breed = "British";
        sonya.nickname = "Sonya";
        sonya.owner = "John";
        sonya.age = 1;

        sonya.meow();
        sonya.scrabble();

        Dog dusya = new Dog();
        dusya.breed = "Rottweiler";
        dusya.nickname = "Dusya";
        dusya.owner = "Anna";
        dusya.age = 5;

        dusya.bark();
        dusya.commands();

        Dog lulu = new Dog();
        lulu.breed = "Pug";
        lulu.nickname = "Lulu";
        lulu.owner = "Peter";
        lulu.age = 6;

        lulu.bark();
        lulu.commands();

        Parrot fifi = new Parrot();
        fifi.breed = "Volnistiy";
        fifi.nickname = "Fifi";
        fifi.owner = "Sam";
        fifi.age = 4;

        fifi.twitter();
        fifi.dance();

        Parrot pirate = new Parrot();
        pirate.breed = "Cockatoo";
        pirate.nickname = "Pirate";
        pirate.owner = "Gloria";
        pirate.age = 10;

        pirate.twitter();
        pirate.dance();

    }

}


// 1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают