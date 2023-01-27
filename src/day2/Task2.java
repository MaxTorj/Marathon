package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();

//        while (a >= b) {
//            System.out.println("Некорректный ввод (число а должно быть < числа b)");
//            System.out.println("Введите два числа:");
//            a = sc.nextInt();
//            b = sc.nextInt();
//        }

        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
