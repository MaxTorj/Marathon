package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File("dushi.txt"));

            while (scanner.hasNextLine()) {
                scanner.useDelimiter("[.,:;()?!\"\\s–]+");
                String line = scanner.nextLine();

                for (String word : line.split("[.,:;()?!\"\\s–]+")) {
                    if (map.get(word) == null) {
                        map.put(word, 1);
                    } else {
                        map.put(word, map.get(word) + 1);
                    }
                }
            }

            scanner.close();

            for (int i = 0; i < 100; i++) {
                int mapMaxValue = (Collections.max(map.values()));

                Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

                while (iterator.hasNext()) {
                    Map.Entry<String, Integer> entry = iterator.next();
                    if (mapMaxValue == entry.getValue()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                        iterator.remove();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
