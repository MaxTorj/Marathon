package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Сухой", 2023,200,100);
        airplane.setReleaseYear(2022);
        airplane.setLength(210);
        airplane.fillUp(1000);
        airplane.fillUp(5000);
        airplane.info();

        Airplane airplane1 = new Airplane("Боинг", 2021, 195, 98);
        airplane1.fillUp(500);
        airplane1.fillUp(2500);
        airplane1.info();
    }
}
