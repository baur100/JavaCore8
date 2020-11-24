package hw5;

public class Weather {
    public static void main(String[] args) {
        weatherReport("Phila","is hight humidity.");
        weatherReport("Washington","the weather is not bad.");
        weatherReport("Miami","sunny as always!");
    }
    public static void weatherReport(String town,String weather){
        System.out.println("Good morning "+town);
        System.out.println("Today in "+town+" "+weather);
}}
