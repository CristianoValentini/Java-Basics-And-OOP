package javabasics._1;

public class Main {
    //Run this like before to execute all the exercises
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Change (my name) to your name
     */
    public static void exercise1() {
        System.out.println("Exercise 1: ");
        System.out.println("Hello Cristiano!"); //<--- Edit this line
    }

    /**
     * 2: Add a new println statement underneath this and put your name in it,
     * this result should look exactly the same as in exercise one if done
     * correctly!
     */
    public static void exercise2() {
        System.out.println("\nExercise 2: ");
        System.out.print("Hello");
        //Write code underneath this
        System.out.println(" Cristiano");

        //Write code above this
    }

    /**
     * 3: Edit this code so when it 'prints' to the console, it all appears on the same line!
     * Expected print = 'This should all appear on the same line'
     */
    public static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Change the code below here
        System.out.print("This should ");
        System.out.print("all appear ");
        System.out.print("on the same line");
        // and above here
    }
}
