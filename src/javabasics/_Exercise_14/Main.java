package javabasics._Exercise_14;

public class Main {
    public static void main(String[] args) {
        exercise1a();
        exercise1b();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     * <p>
     * Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1a() {
        System.out.println("Exercise 1a - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 7;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        do {
            System.out.println("Investment value = €" + Math.round(currentInvestmentValueEuros) + " after " + yearsPast++ + " years" +
                    ", interest this year €" + Math.round(interestGainedThisYearEuros));
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        } while (currentInvestmentValueEuros <= 100_000);
    }

    private static void exercise1b() {
        System.out.println("Exercise 1b - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        do {
            System.out.println("Investment value = €" + Math.round(currentInvestmentValueEuros) + " after " + yearsPast++ + " years" +
                    ", interest this year €" + Math.round(interestGainedThisYearEuros));
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        } while (yearsPast <= 5 || currentInvestmentValueEuros <= 15_000);
    }

    /**
     * 2: Write a while loop for our trading bot!
     * <p>
     * The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     * <p>
     * It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     * It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     * <p>
     * On days where it sells, it can only sell 1000 pounds for euros.
     * <p>
     * Write a while loop
     * <p>
     * Use the calculation for exchange rate below
     * 1 + (Math.random() * 0.2);
     * <p>
     * to recalculate our rate every day (once per loop)
     * <p>
     * Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

       while (remainingPoundsToSell > 0) {
           daysToSell ++ ;
           poundToEuroExchangeRate = 1 + (Math.random() * 0.2) ;

           if (poundToEuroExchangeRate > 1.15) {
               remainingPoundsToSell -= maxPoundsToSellPerDay;
           }
      }

        // Write your while loop here

        System.out.println("It took " + daysToSell + " days to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: for i
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: do while
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2: for each
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: for i
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: while 
     */
}
