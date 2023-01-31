package day6;

class Motorbike {

    private int inputYear;
    private int releaseYear;

    public Motorbike(int inputYear) {
        this.inputYear = inputYear;
    }

    public void info () {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference (int releaseYear) {
        this.releaseYear = releaseYear;
        return Math.abs(inputYear - releaseYear);
    }
}
