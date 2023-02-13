package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers_16.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");

                double avg;
                if (numbers.length < 2)
                    throw new IllegalArgumentException();

                double sum = 0;
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                }
                avg = sum / numbers.length;

                System.out.println("среднее арифметическое чисел равно: " + avg);
                System.out.printf("среднее арифметическое чисел равно: " + "%.3f",avg);

            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException i) {
            System.out.println("Некорректный входной файл");
        }
    }
}
