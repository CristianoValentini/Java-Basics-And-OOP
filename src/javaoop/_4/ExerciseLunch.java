package javaoop._4;

public class ExerciseLunch {

    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;

    private static final double MAX_PRICE = 5;

    private int numberOfTimesWeHaveGotPrice = 0;

    ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public static void printMaxPrice() {
        System.out.println(MAX_PRICE);
    }

    void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    void setPrice(double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    void setPrice(Double price) {
        this.price = price;
    }

    void setNameOfDayEaten(String nameOfDayEaten) {
        this.nameOfDayEaten = nameOfDayEaten;
    }

    void setLunchWeightInGrams(int lunchWeightInGrams) {
        this.lunchWeightInGrams = lunchWeightInGrams;
    }

    void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}

