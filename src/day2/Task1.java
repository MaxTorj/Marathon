package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста введите необходимое колиество этажей:");
        int i = sc.nextInt();

//        while (i <= 0) {
//            System.out.println("Вы ввели отрицательное или нулевое число, повторите ввод:");
//            i = sc.nextInt();
//        }

        if (i >= 1 && i <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (i >= 5 && i <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (i >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
