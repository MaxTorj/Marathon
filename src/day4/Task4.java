package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        int maxSum = 0;
        int maxSumIndex = 0;

        Random random = new Random();

        for (int number = 0; number < numbers.length; number++)
            numbers[number] = random.nextInt(10000);

        for (int number = 0; number < numbers.length - 2; number++) {
            int sum = 0;
            for (int i = number; i < number + 3; i++) {
                sum += numbers[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = number;
            }
        }

        System.out.println("Максимальная сумма трех чисел равна: " + maxSum);
        System.out.println("Индекс максимальной суммы трех чисел равен: " + maxSumIndex);
    }
}
