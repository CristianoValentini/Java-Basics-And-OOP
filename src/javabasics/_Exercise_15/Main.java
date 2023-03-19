package javabasics._Exercise_15;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     */
    private static void exercise1() {

        System.out.println("Exercise 1:");

        String conversionDescription = fromCelsiusToFahrenheit();

        System.out.println(conversionDescription);

    }

    private static String fromCelsiusToFahrenheit() {

        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";

        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     * <p>
     * Make sure to put all the formatting code in the function, formatting:
     * 1) to Upper case
     * 2) Remove spaces at the start and the end
     * 3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            // Call your function
            System.out.println(formattedNames(name));
        }

    }

    private static String formattedNames(String nameToFormat) {

        if (nameToFormat.matches(".*\\d.*")) {
            nameToFormat = "Invalid" ;
        }

        // Cercando su internet ho trovato questo metodo (.matches), utilizzando .*\\d.*" sono andato a fare un check della stringa, per vedere se contenesse numeri,
        // ho preferito utilizzare questo metodo piuttosto che 10 if per comodità.

        return nameToFormat.toUpperCase().trim();

    }


    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // Call your function
        lunch();
    }


    private static void lunch () {

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;


        System.out.println("lunch price = " + myLunchPrice);
        System.out.println("lunch type = " + lunchType);
        System.out.println("description of lunch type = " + description);
        System.out.println("lunch type weight in grams = " + weightInGrams);
    }
}


