package day2;

import java.util.Scanner;

public class Task3 {
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

        int t = a + 1;
        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0) // если в теле блока if только одна строчка, разрешается не ставить {}
                System.out.print(t + " ");

            t++;
        }
    }
}
