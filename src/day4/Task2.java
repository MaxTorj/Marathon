package day4;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        int max = 0;
        int min = 10000;
        int divZero = 0;
        int sum = 0;


        Random random = new Random();

        for (int number = 0; number < numbers.length; number++)
            numbers[number] = random.nextInt(10000);

        for (int variable : numbers) {
            if (variable > max)
                max = variable;
        }
        System.out.println("Наибольший элемент массива: " + max);

        for (int variable : numbers) {
            if (variable < min)
                min = variable;
        }
        System.out.println("Наименьший элемент массива: " + min);


        for (int variable : numbers) {
            if (variable % 10 == 0)
                divZero++;
        }
        System.out.println("Количество элементов заканчивающихся на 0: " + divZero);

        for (int variable : numbers) {
            if (variable % 10 == 0)
                sum += variable;
        }
        System.out.println("Количество элементов, сумма коротых заканчивается на 0: " + sum);
    }
}