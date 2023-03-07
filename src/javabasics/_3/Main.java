package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int age = 18 ;
        System.out.println("My age : " + age);
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
        char firstNameInitial = 'C' ;
        int myAge = 18 ;
        System.out.println("My age= " + myAge  + "  My Initial= " + firstNameInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Creiamo una variabile booleana per chiederci se il soggetto ha mangiato.
        boolean hasEatenLunch = false;
        // Creiamo una double, dove andiamo ad impostare il costo del pranzo.
        double lunchCost = 5.99;
        // In console andiamo a compiere due stampe, la prima andiamo a stampare il costo del pranzo, nella seconda andiamo a stampare se è vero o meno che il soggetto abbia pranzato
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
