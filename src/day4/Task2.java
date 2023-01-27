package day4;



public class Task2 {
    public static void main(String[] args) {
        int[] number = new int[100];
        for (int j : number) {
            number[j] = (int) (Math.random() * 10001);
        }
    }
}