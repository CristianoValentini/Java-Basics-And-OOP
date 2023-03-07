package javabasics._3;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 18 ;
        System.out.println("My age is " + myAge) ;
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char firstNameInitial = 'c' ;
        int myAge = 18 ;
        System.out.println("My age" + myAge + "My Initial" + firstNameInitial) ;
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // sta creando una varianbile booleana con esito false
        boolean hasEatenLunch = false;
        // sta impostando il prezzo del pranzo con un double
        double lunchCost = 5.99;
        // sta stampando in console il prezzo del pranzo e se il soggetto in questione ha mangiato
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
