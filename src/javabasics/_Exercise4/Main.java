package javabasics._Exercise4;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int bottles = 16 ;
        int greenBottles = bottles + 1 ;
        System.out.println("Initial bottles = " + bottles + " total bottles = " + greenBottles);
        int damagedBottles = bottles - 1 ;
        System.out.println("Damaged bottles = " + damagedBottles);

    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        double priceOfPencil = 3.2 ;
        double priceOfTwoPencils = priceOfPencil * 2 ;
        System.out.println("price of one pencil = " + priceOfPencil + "  Price of two pencils = " + priceOfTwoPencils);
        double discountedPencils = priceOfTwoPencils / 2 ;
        System.out.println("the price of two discounted pencils is = " + discountedPencils + "   (Wow, that's the price of just one pencil!)");

    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        double celsius = 22 ;
        var fahrenheit = celsius * 1.8 + 32 ;
        System.out.println(celsius);
        System.out.println(fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        int age = 10 ;
        age ++ ;
        age ++ ;
        age ++ ;
        age ++ ;
        age ++ ;
        System.out.println(age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Write your code here
        int age = 50 ;
        age -= 50 ;
        System.out.println("first age = " + age) ;
        int secondAge = 50 ;
        secondAge = secondAge / 2 ;
        secondAge = secondAge - 10 ;
        secondAge = secondAge - 15 ;
        System.out.println("secondAge = " + secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 10;   // <--- change this value
        int modulus = 2; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                " = " + value % modulus);
    }
}
