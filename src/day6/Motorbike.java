package day6;

class Motorbike {

    private int inputYear;
    private int releaseYear;

    public Motorbike(int inputYear) {
        this.inputYear = inputYear;
    }

    void info () {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference (int releaseYear) {
        this.releaseYear = releaseYear;
        return inputYear - releaseYear;
    }
}
