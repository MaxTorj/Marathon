package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double i = scanner.nextDouble();
//        double j = scanner.nextDouble();
//
//        while (j != 0) {
//            System.out.println(i / j);
//            i = scanner.nextDouble();
//            j = scanner.nextDouble();
//        }
//
//        scanner.close();

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0)
                break;

            System.out.println(a / b);
        }
        scanner.close();
    }
}
