package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] number = new int[100];
        for (int j : number) {
            number[j] = (int) (Math.random() * 1000);
        }
    }
}
