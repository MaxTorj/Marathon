package day6;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2023);
        motorbike.info();
        System.out.println(motorbike.yearDifference(1990));
    }
}
