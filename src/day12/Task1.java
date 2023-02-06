package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Nissan");

        System.out.println(cars);

        cars.add(3,"Tesla");

        System.out.println(cars);

        cars.remove(0);

        System.out.println(cars);
    }
}
