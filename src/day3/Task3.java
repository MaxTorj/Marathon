package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double i;
//        double j;
//
//        for (int c = 0; c < 5; c++) {
//            i = scanner.nextDouble();
//            j = scanner.nextDouble();
//            System.out.println(i / j);
//        }
//
//        scanner.close();

        int counter = 0;

        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            counter++;

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
        scanner.close();
    }
}