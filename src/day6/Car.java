package day6;

public class Car {

    private int inputYear;
    private int releaseYear;

    public Car (int inputYear) {
        this.inputYear = inputYear;
    }

     void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference (int releaseYear) {
        this.releaseYear = releaseYear;
        return inputYear - releaseYear;
    }
}