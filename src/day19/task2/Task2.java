package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, Point> map = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("taxi_cars.txt"));
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Пожалуйста введите координаты: ");
            System.out.println("x1: ");
            int x1 = scanner1.nextInt();
            System.out.println("x2: ");
            int x2 = scanner1.nextInt();
            System.out.println("y1: ");
            int y1 = scanner1.nextInt();
            System.out.println("y2: ");
            int y2 = scanner1.nextInt();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] cars = line.split(" ");
                int[] array = new int[cars.length];

                int i = 0;
                for (String string : cars) {
                    array[i] = Integer.parseInt(string);
                    map.put(array[0], new Point(array[1], array[2]));
                    i++;
                }
            }

            scanner.close();

//            for (Map.Entry<Integer, Point> entry : map.entrySet()) {
//                System.out.println(entry.getKey() + ": " + entry.getValue().getX() + " " + entry.getValue().getY());
//            }
            for (Point point : map.values()) {
                Point value = map.get(point);
                Set<Integer> key = map.keySet();
                if (value.getX() > x1 || value.getY() < x2 && value.getY() > y1 || value.getY() < y2) {
                    System.out.println(map.get(key));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
