package javabasics.Exercise5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        double value = 25 ;
        double valueSquareRoot = Math.sqrt(value) ;
        System.out.println(valueSquareRoot) ;
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        int highestValue = Math.max(valueA, valueB) ;
        int lowestValue = Math.min(valueA, valueB) ;

        System.out.println("Max = " + highestValue);
        System.out.println("Min = " + lowestValue);

    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        int amountOfMoneyRemainingAfterBoughtAsManyAsBurgersAsPossible = totalMoney % costPerBurger ;
        System.out.println("Remainder = " + amountOfMoneyRemainingAfterBoughtAsManyAsBurgersAsPossible);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // con il comando ceil, portiamo il numero di partenza al numero decimale successivo (maggiore)
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // con il comando floor, portiamo il numero di partenza al numero decimale precedente (minore)
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // round ha il compito di arrotondare il numero
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // con il comando pow, in questo caso eleviamo il nostro numero al quadrato
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // con il comando pow, in questo caso eleviamo il nostro numero al cubo
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // il comando server per moltiplicare in modo casuale il nostro numero
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}
