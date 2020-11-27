package hw15;

import java.util.HashMap;

public class Hwork {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();
        System.out.println(countries.size());
        countries.put("USA", "Washington");
        countries.put("KR", "Pishpek");
        countries.put("Russia", "Moscow");
        countries.put("Italy", "Roma");
        countries.put("France", "Paris");
        countries.put("UZ", "Tashkent");
        countries.put("KR", "Bishkek");
        System.out.println(countries);
    }}