package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int eight = 0;
        int one = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        Random random = new Random();
        int[] numbers = new int[n];

        for (int number = 0; number < numbers.length; number++)
            numbers[number] = random.nextInt(10);

        System.out.println(Arrays.toString(numbers));

        System.out.println("Длина массива: " + numbers.length);

        for (int number : numbers) {
            if (number > 8)
                eight++;
        }
        System.out.println("Количество чисел > 8: " + eight);

        for (int number : numbers) {
            if (number == 1)
                one++;
        }
        System.out.println("Количество чисел = 1: " + one);

        for (int number : numbers) {
            if (number % 2 == 0)
                even++;
        }
        System.out.println("Количество четных чисел: " + even);

        for (int number : numbers) {
            if (number % 2 != 0)
                odd++;
        }
        System.out.println("Количество нечетных чисел: " + odd);

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }
}
