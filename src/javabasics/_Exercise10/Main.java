package javabasics._Exercise10;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3Bonus();
    }

    public static void exercise1() {
        System.out.println("Exercise 1 - Fast Food Order:");
        String fastFoodOrder = "fries";
        double orderCost = 0.0;
        int orderCalories = 0;
        switch (fastFoodOrder) {
            case "hamburger":
                orderCalories = 700;
                orderCost = 5.99;
                break;
            case "milkshake":
                orderCalories = 600;
                orderCost = 2.5;
                break;
            case "cheeseburger":
                orderCalories = 850;
                orderCost = 7.99;
                break;
            case "fries":
                orderCalories = 250;
                orderCost = 3.99;
        }

        System.out.println("Order receipt:\nOrder item=" + fastFoodOrder + "\nkCal=" + orderCalories + "\ncost=€" + orderCost);
    }

    public static void exercise2() {
        System.out.println("\nExercise 2 - Prime numbers:");
        int inputNumber = 6;
        switch (inputNumber) {
            case 2:
                System.out.println("This is the 8th largest prime number under 20");
                break;
            case 3:
                System.out.println("This is the 7th largest prime number under 20");
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            default:
                System.out.println("Invalid entry");
                break;
            case 5:
                System.out.println("This is the 6th largest prime number under 20");
                break;
            case 7:
                System.out.println("This is the 5th largest prime number under 20");
                break;
            case 11:
                System.out.println("This is the 4th largest prime number under 20");
                break;
            case 13:
                System.out.println("This is the 3rd largest prime number under 20");
                break;
            case 17:
                System.out.println("This is the 2nd largest prime number under 20");
                break;
            case 19:
                System.out.println("This is the largest prime number under 20");
        }

    }

    public static void exercise3Bonus() {
        System.out.println("\nExercise 3 - Prime  numbers (Bonus)");
        int inputNumber = 17;
        switch (inputNumber) {
            case 2:
                System.out.println("This is the 8th largest prime number under 20");
                break;
            case 3:
                System.out.println("This is the 7th largest prime number under 20");
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            default:
                System.out.println("Invalid entry");
                break;
            case 5:
                System.out.println("This is the 6th largest prime number under 20");
                break;
            case 7:
                System.out.println("This is the 5th largest prime number under 20");
                break;
            case 11:
                System.out.println("This is the 4th largest prime number under 20");
                break;
            case 13:
                System.out.println("This is the 3rd largest prime number under 20");
                break;
            case 17:
                System.out.println("This is the 2nd largest prime number under 20");
                break;
            case 19:
                System.out.println("This is the largest prime number under 20");
        }

    }
}
