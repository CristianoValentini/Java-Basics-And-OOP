package javabasics._Exercise_16;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000L;

        myBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro ;

        System.out.println(myBankBalanceEuro);




        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age
     *    Cercando su internet ho visto che la persona più longeva mai esistita aveva 122 anni, quindi potrei utilizzare byte.
     *    Non sapendo però se qualcuno supererà mai l'età di 127, il che potrebbe essere fattibile, utilizzo short.
     *
     *    2b: The age of a baby in months
     *    utilizzerò byte, questo perché l'età di un bambino in mesi non potrà mai superare 127 (non sarebbe piu' un bambino).
     *
     *    2c: Money in a hedgefund in euros
     *    andrò ad utilizzare long, essendo che i fondi speculativi di una società posso superare i 2_000_000_000 mld.
     *
     *
     *    2d: Price of a good in euros on amazon.com
     *    utilizzerò float
     *
     *
     *    2e: The exact weight of an apple measured by scientific equipment
     *    utilizzerò double
     *
     *
     *    2f: The number of kilometers from any 2 places in the world
     *    utilizzerò short, non credo che due posti possano superare 32_000 km di distanza tra loro.
     *
     *
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate myDate = LocalDate.now();

        System.out.println(myDate);
        System.out.println("\nDay of month = " + myDate.getDayOfMonth());
        System.out.println("\nday of week = " + myDate.getDayOfWeek());
        System.out.println("\nDay of year = " + myDate.getDayOfYear());
        System.out.println("\nMonth of year in letters = " + myDate.getMonth());
        System.out.println("\nMonth of year in numbers = " + myDate.getMonthValue());


        System.out.println("\n-----------------------\n");


        LocalDate ld1 = LocalDate.of(2000, Month.APRIL, 12);
        LocalDate ld2 = LocalDate.of(2001, 6, 23);

        LocalDate ld3 = LocalDate.of(2015, 7, 23);
        LocalDate ld4 = LocalDate.of(2015, 6, 23);

        System.out.println("ld1 = "  + ld1 + "\nld2 = " + ld2 + "\nis ld1 before ld2 ? ---> " + ld1.isBefore(ld2));
        System.out.println("\nld3 = "  + ld3 + "\nld4 = " + ld4 + "\nis ld3 after ld5 ? ---> " + ld3.isAfter(ld4));

    }
}




