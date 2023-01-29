package day6;

public class Task3 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Сухой", 2023,200,100, 0);
        airplane.setReleaseYear(2022);
        airplane.setLength(210);
        airplane.info();
        airplane.setN(1000);
        airplane.fillUp();
        Airplane airplane1 = new Airplane("Боинг", 2021, 195, 98,0);
        airplane1.info();
        airplane1.setN(500);
        airplane1.fillUp();
    }
}
