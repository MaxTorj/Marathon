package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("missing_shoes.txt");
        File shoeFile = new File("shoes.csv");

        try {
            Scanner scanner = new Scanner(shoeFile);
            PrintWriter pw = new PrintWriter(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] warehouse = line.split(";");

                if (Integer.parseInt(warehouse[2]) == 0) {
                    pw.println(line);
                }

                pw.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
