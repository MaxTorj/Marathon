package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, Point> map = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("taxi_cars.txt"));
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

            for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue().getX() + " " + entry.getValue().getY());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
