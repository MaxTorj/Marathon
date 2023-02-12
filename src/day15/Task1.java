package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File shoeFile = new File("shoes.csv");
        Scanner scanner = null;
        try {
            scanner = new Scanner(shoeFile);

            File file = new File("missing_shoes.txt");
            PrintWriter pw = new PrintWriter(file);

            while (scanner.hasNextLine()) {
            String[] warehouse = scanner.nextLine().split(";");

            if (Integer.parseInt(warehouse[2]) == 0) {
                pw.println(warehouse[0] + ", " + warehouse[1] + ", " + warehouse[2]);
            }
        }

        pw.close();
        scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
