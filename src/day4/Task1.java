package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        int y;
        int z;
        int j;


        for (int i : numbers) {
            numbers[i] = (int) (Math.random() * (11));
            sum += numbers[i];
        }
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}