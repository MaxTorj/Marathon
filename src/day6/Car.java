package day6;

public class Car {

    private int inputYear;
    private int releaseYear;

    public Car (int inputYear) {
        this.inputYear = inputYear;
    }

     public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int releaseYear) {
        this.releaseYear = releaseYear;
        return Math.abs(inputYear - releaseYear);
    }
}